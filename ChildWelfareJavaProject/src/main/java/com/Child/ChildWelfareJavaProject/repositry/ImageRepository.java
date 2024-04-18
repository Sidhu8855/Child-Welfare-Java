package com.Child.ChildWelfareJavaProject.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Child.ChildWelfareJavaProject.Entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {

}
