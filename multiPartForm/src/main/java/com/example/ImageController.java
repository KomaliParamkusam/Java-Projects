package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.*;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
public class ImageController {

	private final ImageService imageService;

	@Value("${upload.dir}")
	private String uploadDir;

	public ImageController(ImageService imageService) {
		this.imageService = imageService;
	}

	@GetMapping("/")
	public String index() {
		return "upload";
	}

	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, Model model) throws IOException {
		String filename = imageService.saveImage(file);
		model.addAttribute("imagePath", "/images/" + filename);
		return "upload";
	}

	@GetMapping("/images/{filename:.+}")
	public ResponseEntity<Resource> serveImage(@PathVariable String filename) throws IOException {
		File file = new File(uploadDir, filename);
		if (!file.exists())
			return ResponseEntity.notFound().build();

		Resource resource = new FileSystemResource(file);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaTypeFactory.getMediaType(resource).orElse(MediaType.APPLICATION_OCTET_STREAM));
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}
}
