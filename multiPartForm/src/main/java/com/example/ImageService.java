package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

@Service
public class ImageService 
{

    @Value("${upload.dir}")
    private String uploadDir;

    public String saveImage(MultipartFile file) throws IOException 
    {
        Path path = Paths.get(uploadDir);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }

        String fileName = Path.of(file.getOriginalFilename()).getFileName().toString();
        Path filePath = path.resolve(fileName);
        file.transferTo(filePath);
        return fileName;
    }
}
