package com.Child.ChildWelfareJavaProject.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.repositry.UserRepositry;
import com.Child.ChildWelfareJavaProject.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
   private	UserRepositry userRepositry;
	@Override
	public Responce save(User user) {
		Responce responce = new Responce();// success responce class responce set
		if (user.getUser_id() != null) {
			Optional<User> userbyId = userRepositry.findById(user.getUser_id());
			if (userbyId != null && userbyId.isPresent()) {
				user.setStatus(true);
				userRepositry.save(user);
				responce.Updateuser(user);
				return responce;
			} else
				responce.userNotFound();
			return responce;
		}

		Optional<User> byEmail = userRepositry.findbyEmail(user.getUseremail());
		if (byEmail.isPresent()) {
			responce.EmailAllReadyPresent();
			return responce;
		} else

			user.setStatus(true);
		userRepositry.save(user);
		responce.setUserSaveResponse(user);
		return responce;
	}

}
