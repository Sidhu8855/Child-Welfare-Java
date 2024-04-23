package com.Child.ChildWelfareJavaProject.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Child.ChildWelfareJavaProject.Entity.Orphanage;

@Repository
public interface Orphnagerepo extends JpaRepository<Orphanage, Long> {
	
	

}
