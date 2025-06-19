package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Entity
public class CreditApplicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String purpose;
    private String leadTimeAtDiscovery;
    private String leadAge;
    private String identifiedOn;
    private String sourceChannel;
    private String status;

    @OneToOne
    @JsonIgnore
   private CreditApplicantNextPage creditApplicantNextPage;

    public CreditApplicantNextPage getCreditApplicantNextPage() {
        return creditApplicantNextPage;
    }

    public void setCreditApplicantNextPage(CreditApplicantNextPage creditApplicantNextPage) {
        this.creditApplicantNextPage = creditApplicantNextPage;
    }

    public CreditApplicant(Long id, String companyName, String purpose, String leadTimeAtDiscovery, String leadAge, String identifiedOn, String sourceChannel, String status) {
        this.id = id;
        this.companyName = companyName;
        this.purpose = purpose;
        this.leadTimeAtDiscovery = leadTimeAtDiscovery;
        this.leadAge = leadAge;
        this.identifiedOn = identifiedOn;
        this.sourceChannel = sourceChannel;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CreditApplicant{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", purpose='" + purpose + '\'' +
                ", leadTimeAtDiscovery='" + leadTimeAtDiscovery + '\'' +
                ", leadAge='" + leadAge + '\'' +
                ", identifiedOn='" + identifiedOn + '\'' +
                ", sourceChannel='" + sourceChannel + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public CreditApplicant(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getLeadTimeAtDiscovery() {
        return leadTimeAtDiscovery;
    }

    public void setLeadTimeAtDiscovery(String leadTimeAtDiscovery) {
        this.leadTimeAtDiscovery = leadTimeAtDiscovery;
    }

    public String getLeadAge() {
        return leadAge;
    }

    public void setLeadAge(String leadAge) {
        this.leadAge = leadAge;
    }

    public String getIdentifiedOn() {
        return identifiedOn;
    }

    public void setIdentifiedOn(String identifiedOn) {
        this.identifiedOn = identifiedOn;
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

