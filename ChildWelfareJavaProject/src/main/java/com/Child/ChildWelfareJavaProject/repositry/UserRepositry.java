package com.Child.ChildWelfareJavaProject.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Child.ChildWelfareJavaProject.Entity.Child;
import com.Child.ChildWelfareJavaProject.Entity.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Long> {

	@Query(value = "select * from user where useremail=?", nativeQuery = true)
	Optional<User> findbyEmail(String useremail);

	@Query(value = "select * from user where useremail=?", nativeQuery = true)
	Optional<User> findByEmail(String useremail);
}
