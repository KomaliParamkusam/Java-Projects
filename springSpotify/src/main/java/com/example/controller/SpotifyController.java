package com.example.controller;


	import java.nio.charset.StandardCharsets;
	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpEntity;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpMethod;
	import org.springframework.http.ResponseEntity;
	import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
	import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
	import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;
	import org.springframework.web.client.RestTemplate;
	import org.springframework.web.servlet.mvc.support.RedirectAttributes;
	import org.springframework.web.util.UriUtils;

import com.example.model.SpotifySearchResult;
import com.fasterxml.jackson.databind.JsonNode;
	import com.fasterxml.jackson.databind.ObjectMapper;
	

	@Controller
	public class SpotifyController {


	    @Autowired
	    private RestTemplate restTemplate;

	    @GetMapping("/")
	    public String home() {
	        return "index";
	    }
//	    @GetMapping("/abc")
//	    @ResponseBody
//	    public String homemethod() 
//	    {
//	        return "hey";
//	    }

	    
//	  
	    
	    @GetMapping("/profile")
	    public String profile(
	            OAuth2AuthenticationToken auth,
	            @RegisteredOAuth2AuthorizedClient("spotify") OAuth2AuthorizedClient client,
	            Model model,
	            @RequestParam(name = "query", required = false) String query) {

	        String displayName = auth.getPrincipal().getAttribute("display_name");
	        model.addAttribute("name", displayName);

	        if (query != null && !query.isBlank()) {
	            String accessToken = client.getAccessToken().getTokenValue();

	            HttpHeaders headers = new HttpHeaders();
	            headers.setBearerAuth(accessToken);
	            HttpEntity<?> entity = new HttpEntity<>(headers);

	            String encodedQuery = UriUtils.encode(query, StandardCharsets.UTF_8);
	            String url = "https://api.spotify.com/v1/search?q=" + encodedQuery + "&type=track&limit=20";

	            try {
	                ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
	                ObjectMapper mapper = new ObjectMapper();
	                JsonNode root = mapper.readTree(response.getBody());
	                JsonNode tracks = root.path("tracks").path("items");

	                List<SpotifySearchResult> results = new ArrayList<>();

	                for (JsonNode item : tracks) {
	                    String id = item.path("id").asText();
	                    String trackName = item.path("name").asText();
	                    String type = item.path("type").asText();

	                    // Get album image (if exists)
	                    String imageUrl = "";
	                    JsonNode images = item.path("album").path("images");
	                    if (images.isArray() && images.size() > 0) {
	                        imageUrl = images.get(0).path("url").asText();
	                    }

	                    // External Spotify URL
	                    String externalUrl = item.path("external_urls").path("spotify").asText();

	                    // Add to results list
	                    results.add(new SpotifySearchResult(id, trackName, type, imageUrl, externalUrl));
	                }

	                model.addAttribute("results", results);
	                model.addAttribute("searchQuery", query);

	            } catch (Exception e) {
	                model.addAttribute("error", "Error retrieving Spotify results: " + e.getMessage());
	                e.printStackTrace();
	            }
	        }

	        return "profile"; // maps to /WEB-INF/views/profile.jsp
	    }



	}


