package com.Child.ChildWelfareJavaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.dto.LoginRequest;
import com.Child.ChildWelfareJavaProject.service.UserService;

@CrossOrigin
@RestController
@Controller
@RequestMapping("/user")
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

}
