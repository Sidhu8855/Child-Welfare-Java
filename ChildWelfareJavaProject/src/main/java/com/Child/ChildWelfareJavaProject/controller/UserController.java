package com.Child.ChildWelfareJavaProject.controller;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Child.ChildWelfareJavaProject.Entity.Child;
import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.dto.LoginRequest;
import com.Child.ChildWelfareJavaProject.repositry.ChildRepositry;
import com.Child.ChildWelfareJavaProject.service.UserService;

//@CrossOrigin(origins = "http://localhost:8100")
@CrossOrigin("*")
@RestController
@Controller

public class UserController {
	
	@Autowired
    private	UserService userService;
	@PostMapping("/save")
	public Responce save(@RequestBody User user)
	{
		return userService.save(user); 
	}
	
	@PostMapping("/login")
	public Responce login(@RequestBody LoginRequest loginRequest)
	{
		return userService.loginUser(loginRequest);
	}
	
	
	@Autowired
	ChildRepositry childRepository;
	@PostMapping("postapi")
	 public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file,
             @RequestParam("studentname") String studentname,
             @RequestParam("age") Integer age,
             @RequestParam("location") String location,
             @RequestParam("gender") String gender,
             @RequestParam("bloodgroup") String bloodgroup) {
		if (file.isEmpty()) {
		return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
		}
		
		try {
		// Create a new Child object
		Child child = new Child();
		child.setStudentname(studentname);
		child.setAge(age);
		child.setLocation(location);
		child.setGender(gender);
		child.setBloodgroup(bloodgroup);
		child.setImgname(file.getOriginalFilename());
		child.setStudentimages(file.getBytes());
		
		// Save the Child object to the repository
		childRepository.save(child);
		
		return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
		} catch (IOException e) {
		e.printStackTrace();
		return new ResponseEntity<>("Failed to upload file", HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	
	

	
	
    @GetMapping("/{id}")
    public ResponseEntity<Child> getChildById(@PathVariable Long id) {
        return childRepository.findById(id)
                .map(child -> ResponseEntity.ok().body(child))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
        
  
    @GetMapping("children")
    public ResponseEntity<List<Child>> getAllChildren() {
        List<Child> children = childRepository.findAll();
        return ResponseEntity.ok().body(children);
    }
    
   
    	public void getnewemp() {
		
	}
	
	

}