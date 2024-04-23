package com.Child.ChildWelfareJavaProject.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.dto.LoginRequest;
import com.Child.ChildWelfareJavaProject.repositry.UserRepositry;
import com.Child.ChildWelfareJavaProject.service.UserService;
import com.Child.ChildWelfareJavaProject.role.UserRole;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
   private	UserRepositry userRepositry;
//	@Override
//	public Responce save(User user) {
//		Responce responce = new Responce();
//		if (user.getUser_id() != null) {
//			Optional<User> userbyId = userRepositry.findById(user.getUser_id());
//			if (userbyId != null && userbyId.isPresent()) {
//				user.setStatus(true);
//				userRepositry.save(user);
//				responce.Updateuser(user);
//				return responce;
//			} else
//				responce.userNotFound();
//			return responce;
//		}
//
//		Optional<User> byEmail = userRepositry.findbyEmail(user.getUseremail());
//		if (byEmail.isPresent()) {
//			responce.EmailAllReadyPresent();
//			return responce;
//		} else
//
//		user.setStatus(true);
//		userRepositry.save(user);
//		responce.setUserSaveResponse(user);
//		return responce;
//	}
	
	
	@Override
    public Responce save(User user) {
		Responce responce = new Responce();
        if (user.getUser_id() != null) {
            Optional<User> userById = userRepositry.findById(user.getUser_id());
            if (userById.isPresent()) {
                user.setStatus(true);
                userRepositry.save(user);
                responce.Updateuser(user);
                return responce;
            } else {
            	responce.userNotFound();
                return responce;
            }
        }

        Optional<User> byEmail = userRepositry.findByEmail(user.getUseremail());
        if (byEmail.isPresent()) {
        	responce.EmailAllReadyPresent();
            return responce;
        }

        // Set default role if not provided
        if (user.getRole() == null) {
            user.setRole(UserRole.USER);
        }

        user.setStatus(true);
        userRepositry.save(user);
        responce.setUserSaveResponse(user);
        return responce;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//login user side
	@Override
	public Responce loginUser(LoginRequest loginRequest) {
	    Responce responce = new Responce();

	    if (loginRequest != null) {
	        String loginEmail = loginRequest.getUseremail();
	        String loginPassword = loginRequest.getPassword();
	        
	        // Find user by email
	        Optional<User> byEmail = userRepositry.findByEmail(loginEmail);

	        if (byEmail.isPresent()) {
	            User user = byEmail.get();

	            // Check if the provided password matches the user's password
	            if (loginPassword.equals(user.getPassword())) {
	                // Password matches
	                
	                if (UserRole.USER.equals(user.getRole())||UserRole.ADMIN.equals(user.getRole())) {
	                   
	                    responce.loginSuccessFully(user);
	                } else {
	                   
	                	responce.loginFailedByUserRole();
	                }
	            } else {
	                // Password doesn't match
	            	responce.loginFailedByIncorrectPassword();
	            }
	        } else {
	           
	        	responce.invalidEmail();
	        }
	    } else {
	      
	    	responce.fieldIsNull();
	    }

	    return responce;
	}

	
	
	
	
	
	
}
