package com.codeIntern.pumbkin.model;

import jakarta.persistence.*;

@Entity
public class CreditApplicantNextPage {


    @Id
    private Long id;
    private Boolean isEnable=false;

    @OneToOne(mappedBy = "creditApplicantNextPage",cascade = CascadeType.ALL)
    private CreditApplicant creditApplicant;

    @Override
    public String toString() {
        return "CreditApplicantNextPage{" +
                "id='" + id + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }

    public CreditApplicantNextPage(Long id, Boolean isEnable) {
        this.id = id;
        this.isEnable = isEnable;
    }
    CreditApplicantNextPage(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public CreditApplicant getCreditApplicant() {
        return creditApplicant;
    }

    public void setCreditApplicant(CreditApplicant creditApplicant) {
        this.creditApplicant = creditApplicant;
    }
}
