package com.Child.ChildWelfareJavaProject.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.Child.ChildWelfareJavaProject.Entity.Child;
import com.Child.ChildWelfareJavaProject.Entity.Image;
import com.Child.ChildWelfareJavaProject.repositry.ImageRepository;
import com.Child.ChildWelfareJavaProject.service.ImageService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/images")
@CrossOrigin(origins = "http://localhost:8100")
public class ImageController {

    @Autowired
    
    private ImageService imageService;

//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
//        try {
//            imageService.saveImage(file.getBytes());
//            return ResponseEntity.ok("Image uploaded successfully.");
//        } catch (IOException e) {
//        	  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image");
//        	        }
//    }
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            imageService.saveImage(file.getBytes());
            return ResponseEntity.ok("Image uploaded successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image");
        }
    }
    
    @Autowired
    ImageRepository  imageRepository;
    
	@GetMapping("images")
	public ResponseEntity<List<Image>> Getallimgage() {
		List<Image> image = imageRepository.findAll();
		return ResponseEntity.ok().body(image);
	}

    
    
//    @GetMapping("/{id}")
//    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {
//        Optional<Image> imageOptional = imageService.getImageById(id);
//        if (imageOptional.isPresent()) {
//            Image image = imageOptional.get();
//            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image.getData());
//        } else {
//            return ResponseEntity.notFound().build();
//        	
//        			 
//        }
//    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {
        Optional<Image> imageOptional = imageService.getImageById(id);
        if (imageOptional.isPresent()) {
            Image image = imageOptional.get();
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image.getData());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}