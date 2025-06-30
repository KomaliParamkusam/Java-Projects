package com.example.cfgs;

	
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.web.SecurityFilterChain;

import org.springframework.web.client.RestTemplate;
	@Configuration
	@EnableWebSecurity
	public class SecurityConfig 
	{
		@Bean
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		    http
		        .authorizeHttpRequests(auth -> auth
		            .requestMatchers("/", "/index", "/css/**", "/js/**").permitAll()
		            .anyRequest().authenticated()
		        )
		        .oauth2Login(oauth2 -> oauth2
		            .defaultSuccessUrl("/profile", true) // ⬅️ This redirects here after login
		        );
		    http.csrf().disable();
		    return http.build();
		    
		}

		@Bean
		public RestTemplate template()
		{
			return new RestTemplate();
		}
		
	}


