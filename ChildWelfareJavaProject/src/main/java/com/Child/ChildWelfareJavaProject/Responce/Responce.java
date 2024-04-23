package com.Child.ChildWelfareJavaProject.Responce;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import com.Child.ChildWelfareJavaProject.Entity.User;

public class Responce {

	private Object response;
	private Boolean status;
	private String message;
	private HttpStatusCode statusCode;
	

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatusCode statusCode) {
		this.statusCode = statusCode;
	}

	public void setUserSaveResponse(Object userResponse) {

		this.response = userResponse;
		this.status = true;
		this.statusCode = HttpStatus.CREATED;
		this.message = Message.User_Created;
	}

	public void userNotFound() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.NOT_FOUND;
		this.message = Message.Not_Found;

	}

	public void Updateuser(Object userresponce ) {
		this.response=userresponce;
		this.status=true;
		this.statusCode=HttpStatus.OK;
		this.message=Message.User_Update_Successfully;
		
	}

	public void EmailAllReadyPresent() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.NO_CONTENT;
		this.message = Message.email_already_exist;
		
	}

	public void UserIdNotFound() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.NO_CONTENT;
		this.message = Message.Not_Found;
		
		
	}

	public void UserFound( Object responce) {
		this.response=responce;
		this.status=true;
		this.statusCode=HttpStatus.OK;
		this.message=Message.User_Found;
	}

	public void fieldIsNull() {
		this.response=null;
		this.status=false;
		this.statusCode=HttpStatus.NOT_FOUND;
		this.message=Message.IdNotFound;
		
	}

	public void setUserLoggedInResponse(User user) {
		this.response=user;
		this.status=true;
		this.statusCode=HttpStatus.OK;
		this.message=Message.User_Found;
		
	}

	public void invalidPassword() {
		// TODO Auto-generated method stub
		
	}

	public void loginSuccessFully(User users) {
		this.response = users;
		this.status = true;
		this.statusCode = HttpStatus.OK;
		this.message = Message.login_successfully;
		
	}

	public void loginFailedByUserRole() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.FORBIDDEN;
		this.message = Message.user_role;
		
	}

	public void loginFailedByIncorrectPassword() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.UNAUTHORIZED;
		this.message = Message.incorrect_password;
		
	}

	public void invalidEmail() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.NOT_FOUND;
		this.message = Message.invalid_User_Email;
		
	}

	public void emailSendResponse(int randomNumber) {
		
		this.response = randomNumber;
		this.status = true;
		this.statusCode = HttpStatus.OK;
		this.message = Message.email_send_successfully;
	}

	public void emailNotSend() {
		this.response = null;
		this.status = false;
		this.statusCode = HttpStatus.NOT_FOUND;
		this.message = Message.invalid_User_Email;
		
	}

	
}
