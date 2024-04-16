package com.Child.ChildWelfareJavaProject.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Child.ChildWelfareJavaProject.Entity.Child;

public interface ChildRepositry extends JpaRepository<Child,Long> {

	

}
