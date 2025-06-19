package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ExecutiveAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String associationName;
    private String membershipNumber;
    private LocalDate dateOfJoining;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "promoter_id")
    @JsonBackReference
    private Promoter promoter;

    // This is default Constructor that is used by the Hibernate //
    public  ExecutiveAssociation(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Promoter getPromoter() {
        return promoter;
    }

    public void setPromoter(Promoter promoter) {
        this.promoter = promoter;
    }

    public ExecutiveAssociation(Long id, String associationName, String membershipNumber, LocalDate dateOfJoining, Promoter promoter) {
        this.id = id;
        this.associationName = associationName;
        this.membershipNumber = membershipNumber;
        this.dateOfJoining = dateOfJoining;
        this.promoter = promoter;
    }

    @Override
    public String toString() {
        return "ExecutiveAssociation{" +
                "id=" + id +
                ", associationName='" + associationName + '\'' +
                ", membershipNumber='" + membershipNumber + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", promoter=" + promoter +
                '}';
    }
}
