package com.Child.ChildWelfareJavaProject.Entity;

import com.Child.ChildWelfareJavaProject.role.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long user_id;
	private String username;
	private String useremail;
	private String password;
	private String mobilenumber;
	private UserRole role;
	private boolean status;
	
	
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", useremail=" + useremail + ", password="
				+ password + ", mobilenumber=" + mobilenumber + ", role=" + role + ", status=" + status + "]";
	}
	public User(Long user_id, String username, String useremail, String password, String mobilenumber, UserRole role,
			boolean status) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.useremail = useremail;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.role = role;
		this.status = status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
