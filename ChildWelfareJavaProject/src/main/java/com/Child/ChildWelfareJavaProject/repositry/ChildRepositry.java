package com.Child.ChildWelfareJavaProject.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Child.ChildWelfareJavaProject.Entity.Child;

@Repository
public interface ChildRepositry extends JpaRepository<Child,Long> {

	

}
