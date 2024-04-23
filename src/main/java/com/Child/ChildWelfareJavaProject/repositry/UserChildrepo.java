package com.Child.ChildWelfareJavaProject.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Child.ChildWelfareJavaProject.Entity.Orphanage;
import com.Child.ChildWelfareJavaProject.Entity.UserChild;

@Repository
public interface UserChildrepo extends JpaRepository<UserChild,Long>{

	
}