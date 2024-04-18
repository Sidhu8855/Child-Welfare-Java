package com.Child.ChildWelfareJavaProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Child {
		
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String studentname;
	
	
	private String location;
	private Integer age;
	private String gender;
	private String bloodgroup;

    private String imgname;
	@Column(columnDefinition = "LONGBLOB")
	@Lob
    private byte[] studentimages;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Number getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public byte[] getStudentimages() {
		return studentimages;
	}
	public void setStudentimages(byte[] studentimages) {
		this.studentimages = studentimages;
	}
	public Child(Long id, String studentname, Integer age, String location, String gender, String bloodgroup,
			String imgname, byte[] studentimages) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.age = age;
		this.location = location;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.imgname = imgname;
		this.studentimages = studentimages;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
	
	
	
	

}
