package com.Child.ChildWelfareJavaProject.Entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
	@Entity
	@Table(name = "user_child")
	public class UserChild {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)// Assuming auto-increment ID
	    private Long id;
	    
	    @Column(name = "description", length = 255)
	    private String description;
	    
	    @Column(columnDefinition = "LONGBLOB")
		@Lob
	    private byte[] childImages;
	    
	    @Column(name = "imgname", length = 255)
	    private String imageName;
	    
	    @Column(name = "location", length = 255)
	    private String location;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public byte[] getChildImages() {
			return childImages;
		}

		public void setChildImages(byte[] childImages) {
			this.childImages = childImages;
		}

		public String getImageName() {
			return imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public UserChild(Long id, String description, byte[] childImages, String imageName, String location) {
			super();
			this.id = id;
			this.description = description;
			this.childImages = childImages;
			this.imageName = imageName;
			this.location = location;
		}

		public UserChild() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "UserChild [id=" + id + ", description=" + description + ", childImages="
					+ Arrays.toString(childImages) + ", imageName=" + imageName + ", location=" + location + "]";
		}
	  
}