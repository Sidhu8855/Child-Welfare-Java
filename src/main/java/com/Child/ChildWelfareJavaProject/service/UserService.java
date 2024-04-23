package com.Child.ChildWelfareJavaProject.service;

import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.dto.LoginRequest;

public interface UserService {

	Responce save(User user);
	Responce loginUser(LoginRequest loginRequest);
	
	

	
}
