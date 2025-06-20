package com.codeIntern.pumbkin.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Arrays;
// Amit Kumar//
@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;

    @NotBlank(message = "GSTIN is required")
    @Pattern(regexp = "\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}", message = "Invalid GSTIN format")
    private String gstin;


    @NotBlank(message = "GST Type is required")
    private String gstType;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Type is required")
    private String type;


    @NotBlank(message = "Sector is required")
    private String sector;

    @NotBlank(message = "Industry is required")
    private String industry;

    @NotBlank(message = "Date of birth is required")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "DOB must be in format YYYY-MM-DD")
    private String dob;

    @NotBlank(message = "PAN number is required")
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Invalid PAN format")
    private String panNo;


    @Pattern(regexp = "\\d{12}", message = "MSME number must be 12 digits")
    private String msmeNo;

    @NotBlank(message = "Address is required")
    private String address;


    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;


    @NotBlank(message = "ZIP is required")
    @Pattern(regexp = "\\d{6}", message = "ZIP code must be 6 digits")
    private String zip;

    @NotBlank(message = "Country is required")
    private String country;

    @Pattern(regexp = "\\d{12}", message = "Aadhar number must be 12 digits")
    private String aadharNo;

    @Size(max = 100, message = "PAN file name too long")
    private String panFileName;


    @Size(max = 100, message = "Aadhar file name too long")
    private String aadharFileName;

    @Size(max = 100, message = "MSME file name too long")
    private String msmeFileName;

    @Lob
    private byte[] panFile;

    @Lob
    private byte[] aadharFile;

    @Lob
    private byte[] msmeFile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getGstType() {
        return gstType;
    }

    public void setGstType(String gstType) {
        this.gstType = gstType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getMsmeNo() {
        return msmeNo;
    }

    public void setMsmeNo(String msmeNo) {
        this.msmeNo = msmeNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getPanFileName() {
        return panFileName;
    }

    public void setPanFileName(String panFileName) {
        this.panFileName = panFileName;
    }

    public String getAadharFileName() {
        return aadharFileName;
    }

    public void setAadharFileName(String aadharFileName) {
        this.aadharFileName = aadharFileName;
    }

    public String getMsmeFileName() {
        return msmeFileName;
    }

    public void setMsmeFileName(String msmeFileName) {
        this.msmeFileName = msmeFileName;
    }

    public byte[] getPanFile() {
        return panFile;
    }

    public void setPanFile(byte[] panFile) {
        this.panFile = panFile;
    }

    public byte[] getAadharFile() {
        return aadharFile;
    }

    public void setAadharFile(byte[] aadharFile) {
        this.aadharFile = aadharFile;
    }

    public Applicant(Long id, String gstin, String gstType, String name, String type, String sector, String industry, String dob, String panNo, String msmeNo, String address, String city, String state, String zip, String country, String aadharNo, String panFileName, String aadharFileName, String msmeFileName, byte[] panFile, byte[] aadharFile, byte[] msmeFile) {
        this.id = id;
        this.gstin = gstin;
        this.gstType = gstType;
        this.name = name;
        this.type = type;
        this.sector = sector;
        this.industry = industry;
        this.dob = dob;
        this.panNo = panNo;
        this.msmeNo = msmeNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.aadharNo = aadharNo;
        this.panFileName = panFileName;
        this.aadharFileName = aadharFileName;
        this.msmeFileName = msmeFileName;
        this.panFile = panFile;
        this.aadharFile = aadharFile;
        this.msmeFile = msmeFile;
    }

    public  Applicant(){

    }
    public byte[] getMsmeFile() {
        return msmeFile;
    }

    public void setMsmeFile(byte[] msmeFile) {
        this.msmeFile = msmeFile;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", gstin='" + gstin + '\'' +
                ", gstType='" + gstType + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sector='" + sector + '\'' +
                ", industry='" + industry + '\'' +
                ", dob='" + dob + '\'' +
                ", panNo='" + panNo + '\'' +
                ", msmeNo='" + msmeNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", panFileName='" + panFileName + '\'' +
                ", aadharFileName='" + aadharFileName + '\'' +
                ", msmeFileName='" + msmeFileName + '\'' +
                ", panFile=" + Arrays.toString(panFile) +
                ", aadharFile=" + Arrays.toString(aadharFile) +
                ", msmeFile=" + Arrays.toString(msmeFile) +
                '}';
    }


}
