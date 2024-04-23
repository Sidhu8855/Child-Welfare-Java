package com.Child.ChildWelfareJavaProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orphanage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orphanageId; // Corrected field name

    private String orphanageCity;
    private String orphanageName;
    private String orphanageLocation;
    private String orphanageMobile;
    private String orphanageEmail;

    // Getters and setters
    public Long getOrphanageId() {
        return orphanageId;
    }

    public void setOrphanageId(Long orphanageId) {
        this.orphanageId = orphanageId;
    }

    public String getOrphanageCity() {
        return orphanageCity;
    }

    public void setOrphanageCity(String orphanageCity) {
        this.orphanageCity = orphanageCity;
    }

    public String getOrphanageName() {
        return orphanageName;
    }

    public void setOrphanageName(String orphanageName) {
        this.orphanageName = orphanageName;
    }

    public String getOrphanageLocation() {
        return orphanageLocation;
    }

    public void setOrphanageLocation(String orphanageLocation) {
        this.orphanageLocation = orphanageLocation;
    }

    public String getOrphanageMobile() {
        return orphanageMobile;
    }

    public void setOrphanageMobile(String orphanageMobile) {
        this.orphanageMobile = orphanageMobile;
    }

    public String getOrphanageEmail() {
        return orphanageEmail;
    }

    public void setOrphanageEmail(String orphanageEmail) {
        this.orphanageEmail = orphanageEmail;
    }

    @Override
    public String toString() {
        return "Orphanage [orphanageId=" + orphanageId + ", orphanageCity=" + orphanageCity + ", orphanageName="
                + orphanageName + ", orphanageLocation=" + orphanageLocation + ", orphanageMobile=" + orphanageMobile
                + ", orphanageEmail=" + orphanageEmail + "]";
    }
}
