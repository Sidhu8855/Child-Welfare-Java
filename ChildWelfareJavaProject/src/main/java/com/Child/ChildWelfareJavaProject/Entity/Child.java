package com.Child.ChildWelfareJavaProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;

public class Child {
	
	private String studentname;
	private Number age;
	private String location;
	
	private String gender;
	private String bloodgroup;
	
	@Column(columnDefinition = "LONGBLOB")
	@Lob
	private byte[] student_images;
	
	

}
