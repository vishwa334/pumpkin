package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;

 // Amit
@Entity
public class Promoter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


     @NotBlank(message = "Name is required")
    private String name;

     @NotBlank(message = "Designation is required")
    private String designation;

     @Min(value = 0, message = "Shareholding must be non-negative")
     @Max(value = 100, message = "Shareholding cannot exceed 100%")
    private Double shareholding;

     @NotNull(message = "Date of birth is required")
    private String dob;

     @Pattern(regexp = "\\d{12}", message = "Aadhar must be 12 digits")
    private String aadhar;

     @Min(value = 18, message = "Age must be at least 18")
    private Integer age;


     @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]", message = "Invalid PAN format")
    private String pan;

     @NotBlank(message = "Address is required")
    private String address;
     @Min(value = 0, message = "Years in address must be non-negative")
    private Integer yearsInAddress;
     private String din;

    private Boolean politicallyExposed;

//    @OneToMany(mappedBy = "promoter", cascade = CascadeType.ALL, orphanRemoval = true)
//@JsonManagedReference
//    private List<SocialReference> socialReferences;


    @OneToMany(mappedBy = "promoter", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<SocialReference> socialReferences;


     @OneToMany(mappedBy = "promoter", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
     @JsonManagedReference
     private List<ExecutiveAssociation> executiveAssociations;

     public    Promoter(){
     }

     public List<ExecutiveAssociation> getExecutiveAssociations() {
         return executiveAssociations;
     }

     // Optional: Setter too
     public void setExecutiveAssociations(List<ExecutiveAssociation> executiveAssociations) {
         this.executiveAssociations = executiveAssociations;
     }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getShareholding() {
        return shareholding;
    }

    public void setShareholding(Double shareholding) {
        this.shareholding = shareholding;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYearsInAddress() {
        return yearsInAddress;
    }

    public void setYearsInAddress(Integer yearsInAddress) {
        this.yearsInAddress = yearsInAddress;
    }

    public String getDin() {
        return din;
    }

    public void setDin(String din) {
        this.din = din;
    }

    public Boolean getPoliticallyExposed() {
        return politicallyExposed;
    }

    public void setPoliticallyExposed(Boolean politicallyExposed) {
        this.politicallyExposed = politicallyExposed;
    }

    public List<SocialReference> getSocialReferences() {
        return socialReferences;
    }

    public void setSocialReferences(List<SocialReference> socialReferences) {
        this.socialReferences = socialReferences;
    }

    public Promoter(Long id, String name, String designation, Double shareholding, String dob, String aadhar, Integer age, String pan, String address, Integer yearsInAddress, String din, Boolean politicallyExposed, List<SocialReference> socialReferences) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.shareholding = shareholding;
        this.dob = dob;
        this.aadhar = aadhar;
        this.age = age;
        this.pan = pan;
        this.address = address;
        this.yearsInAddress = yearsInAddress;
        this.din = din;
        this.politicallyExposed = politicallyExposed;
        this.socialReferences = socialReferences;
    }

    @Override
    public String toString() {
        return "Promoter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", shareholding=" + shareholding +
                ", dob='" + dob + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", age=" + age +
                ", pan='" + pan + '\'' +
                ", address='" + address + '\'' +
                ", yearsInAddress=" + yearsInAddress +
                ", din='" + din + '\'' +
                ", politicallyExposed=" + politicallyExposed +
                ", socialReferences=" + socialReferences +
                '}';
    }


 }
