package com.Child.ChildWelfareJavaProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Child.ChildWelfareJavaProject.Entity.Image;
import com.Child.ChildWelfareJavaProject.repositry.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(byte[] imageData) {
        Image image = new Image();
        image.setData(imageData);
        imageRepository.save(image);
    }
    
    
//    public Optional<Image> getImageById(Long id) {
//        return imageRepository.findById(id);
//    }
    //single image get
    public Optional<Image> getImageById(Long id) {
        return imageRepository.findById(id);
    }
    
    public Optional<byte[]> getImageDataById(Long id) {
        Optional<Image> imageOptional = imageRepository.findById(id);
        return imageOptional.map(Image::getData);
    }


	


    
	

}
