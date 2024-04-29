//package com.Child.ChildWelfareJavaProject.controller;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.Child.ChildWelfareJavaProject.Entity.Child;
//import com.Child.ChildWelfareJavaProject.Entity.Image;
//import com.Child.ChildWelfareJavaProject.Entity.Orphanage;
//import com.Child.ChildWelfareJavaProject.Entity.User;
//import com.Child.ChildWelfareJavaProject.Entity.UserChild;
//import com.Child.ChildWelfareJavaProject.Responce.Responce;
//import com.Child.ChildWelfareJavaProject.dto.LoginRequest;
//import com.Child.ChildWelfareJavaProject.repositry.ChildRepositry;
//import com.Child.ChildWelfareJavaProject.repositry.Orphnagerepo;
//import com.Child.ChildWelfareJavaProject.repositry.UserChildrepo;
//import com.Child.ChildWelfareJavaProject.service.UserService;
//
////@CrossOrigin(origins = "http://localhost:8100")
//@CrossOrigin("*")
//@RestController
////@Controller
//public class UserController {
//
//	@Autowired
//	private UserService userService;
//
//	@PostMapping("/save")
//	public Responce save(@RequestBody User user) {
//		return userService.save(user);
//	}
//
//	@PostMapping("/login")
//	public Responce login(@RequestBody LoginRequest loginRequest) {
//		return userService.loginUser(loginRequest);
//	}
//
//	@Autowired
//	ChildRepositry childRepository;
//
//	@PostMapping("postapi")
//	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file,
//			@RequestParam("studentname") String studentname, @RequestParam("age") Integer age,
//			@RequestParam("location") String location, @RequestParam("gender") String gender,
//			@RequestParam("bloodgroup") String bloodgroup) {
//		if (file.isEmpty()) {
//			return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
//		}
//
//		try {
//			// Create a new Child object
//			Child child = new Child();
//			child.setStudentname(studentname);
//			child.setAge(age);
//			child.setLocation(location);
//			child.setGender(gender);
//			child.setBloodgroup(bloodgroup);
//			child.setImgname(file.getOriginalFilename());
//			child.setStudentimages(file.getBytes());
//
//			// Save the Child object to the repository
//			childRepository.save(child);
//
//			return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return new ResponseEntity<>("Failed to upload file", HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Child> getChildById(@PathVariable Long id) {
//		return childRepository.findById(id).map(child -> ResponseEntity.ok().body(child))
//				.orElseGet(() -> ResponseEntity.notFound().build());
//	}
//
//	@GetMapping("children")
//	public ResponseEntity<List<Child>> getAllChildren() {
//		List<Child> children = childRepository.findAll();
//		return ResponseEntity.ok().body(children);
//	}
//
//	public void getnewemp() {
//
//	}
//
//
//	@Autowired
//    private UserChildrepo userchildrepo;
//
////    @PostMapping("/uploadUserChild")
////    public ResponseEntity<String> uploadUserChild(
////            @RequestParam("file") MultipartFile file,
////            @RequestParam("location") String location,
////            @RequestParam("description") String description) {
////        if (file.isEmpty()) {
////            return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
////        }
////
////        try {
////            UserChild userchild = new UserChild();
////            userchild.setLocation(location);
////            userchild.setDescription(description);
////            userchild.setImageName(file.getOriginalFilename());
////            userchild.setChildImages(file.getBytes());
////
////            userchildrepo.save(userchild);
////
////            return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
////        } catch (IOException e) {
////            e.printStackTrace();
////           return new ResponseEntity<>("Failed to upload file",HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
//	@PostMapping("/uploadUserChild")
//	public ResponseEntity<String> uploadUserChild(
//	        @RequestParam("file") MultipartFile file,
//	        @RequestParam("location") String location,
//	        @RequestParam("description") String description) {
//	    if (file.isEmpty()) {
//	        return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
//	    }
//
//	    try {
//	        UserChild userchild = new UserChild();
//	        userchild.setLocation(location);
//	        userchild.setDescription(description);
//	        userchild.setImageName(file.getOriginalFilename());
//	        userchild.setChildImages(file.getBytes());
//
//	        userchildrepo.save(userchild);
//
//	        return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	       return new ResponseEntity<>("Failed to upload file",HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	}
//	
//	@GetMapping("Userchlidrecord")
//	public ResponseEntity<List<UserChild>> Getallimgage() {
//		List<UserChild> user = userchildrepo.findAll();
//		return ResponseEntity.ok().body(user);
//	}
//	
//	
//	
//	   private final Orphnagerepo orphanageRepository;
//
//	    @Autowired
//	    public UserController(Orphnagerepo orphanageRepository) {
//	        this.orphanageRepository = orphanageRepository;
//	    }
//
//	    @PostMapping("/postdata") // Corrected endpoint URL
//	    public Orphanage Postapi(@RequestBody Orphanage orphanage) {
//	        return orphanageRepository.save(orphanage);
//	    }
//	
//	@GetMapping("getorphanage")
//	public ResponseEntity<List<Orphanage>> Getorphanage() {
//		List<Orphanage> user = orphanageRepository.findAll();
//		return ResponseEntity.ok().body(user);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}


package com.Child.ChildWelfareJavaProject.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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
import com.Child.ChildWelfareJavaProject.Entity.Image;
import com.Child.ChildWelfareJavaProject.Entity.Orphanage;
import com.Child.ChildWelfareJavaProject.Entity.User;
import com.Child.ChildWelfareJavaProject.Entity.UserChild;
import com.Child.ChildWelfareJavaProject.Responce.Responce;
import com.Child.ChildWelfareJavaProject.dto.LoginRequest;

import com.Child.ChildWelfareJavaProject.emailServce.MailService;
import com.Child.ChildWelfareJavaProject.repositry.ChildRepositry;
import com.Child.ChildWelfareJavaProject.repositry.Orphnagerepo;
import com.Child.ChildWelfareJavaProject.repositry.UserChildrepo;
import com.Child.ChildWelfareJavaProject.repositry.UserRepositry;
import com.Child.ChildWelfareJavaProject.service.UserService;

//@CrossOrigin(origins = "http://localhost:8100")
@CrossOrigin()
@RestController
//@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public Responce save(@RequestBody User user) {
		return userService.save(user);
	}

	@PostMapping("login")
	public Responce login(@RequestBody LoginRequest loginRequest) {
		return userService.loginUser(loginRequest);
	}

	@Autowired
	ChildRepositry childRepository;

	@PostMapping("postapi")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file,
			@RequestParam("studentname") String studentname, @RequestParam("age") Integer age,
			@RequestParam("location") String location, @RequestParam("gender") String gender,
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
		return childRepository.findById(id).map(child -> ResponseEntity.ok().body(child))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("children")
	public ResponseEntity<List<Child>> getAllChildren() {
		List<Child> children = childRepository.findAll();
		return ResponseEntity.ok().body(children);
	}

	
	@Autowired
    private UserChildrepo userchildrepo;

	@PostMapping("uploadUserChild")
	public ResponseEntity<String> uploadUserChild(
	        @RequestParam("file") MultipartFile file,
	        @RequestParam("location") String location,
	        @RequestParam("description") String description) {
	    if (file.isEmpty()) {
	        return new ResponseEntity<>("Please select a file to upload", HttpStatus.BAD_REQUEST);
	    }

	    try {
	        UserChild userchild = new UserChild();
	        userchild.setLocation(location);
	        userchild.setDescription(description);
	        userchild.setImageName(file.getOriginalFilename());
	        userchild.setChildImages(file.getBytes());

	        userchildrepo.save(userchild);

	        return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
	    } catch (IOException e) {
	        e.printStackTrace();
	       return new ResponseEntity<>("Failed to upload file",HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	

	@GetMapping("Userchlidrecord")
	public ResponseEntity<List<UserChild>> Getallimgage() {
		List<UserChild> user = userchildrepo.findAll();
		return ResponseEntity.ok().body(user);
	}
	
	
	
	   private final Orphnagerepo orphanageRepository;

	    @Autowired
	    public UserController(Orphnagerepo orphanageRepository) {
	        this.orphanageRepository = orphanageRepository;
	    }

	    @PostMapping("/postdata") // Corrected endpoint URL
	    public Orphanage Postapi(@RequestBody Orphanage orphanage) {
	        return orphanageRepository.save(orphanage);
	    }
	
	@GetMapping("getorphanage")
	public ResponseEntity<List<Orphanage>> Getorphanage() {
		List<Orphanage> user = orphanageRepository.findAll();
		return ResponseEntity.ok().body(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	@Autowired 
	UserRepositry userRepositry;
	
	
	
	@Autowired
	private MailService mailService;
	
//	@PostMapping("/sendEmail")
//	public Responce sendEmail(@RequestBody Mail info) {
//		Mail mail = new Mail();
//		Responce responce = new Responce();
//		Optional<User> byEmail = userRepositry.findByEmail(info.getMailTo());
//		System.out.println(byEmail);
//		
//		if(byEmail.isPresent()) {
//			System.out.println("Email is " + byEmail.get().getUseremail());
//		int randomNumber = (int) (Math.random() * 900000) + 100000;
//		mail.setMailFrom("rajegoreyogesh@gmail.com");
//		mail.setMailTo(info.getMailTo());
//		mail.setMailSubject("OTP for forget Password");
//		mail.setMailContent("Hello Mail send Successfully. Your OTP is : " + randomNumber);
//		mailService.sendEmail(mail);
//		//mailService.sendEmail(mail);
//		responce.emailSendResponse(randomNumber);
//		//System.out.println("hello"this.m);
//		return responce;
//		}else {
//			responce.emailNotSend();
//			return responce;
//		}
//	}


}