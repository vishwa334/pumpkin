//Nitish Kumar
package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//Model class of EndUseDetail that stores the Loan Fund
//POJO class
@Entity
public class EndUseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    This is match the values from EndUseEnum Enumeration
    @Enumerated(EnumType.STRING)
    private EndUseEnum endUse;

    private String fundRequiredDate;
    private String loanDuration;
    private Double loanAmount;

//    Using One to One relation mapping with CreditRequirement POJO class using @JoinColumn annotation to relation
    @OneToOne
    @JoinColumn(name = "credit_requirement_id")
    @JsonIgnore
    private CreditRequirement creditRequirement;

//    Getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public EndUseEnum getEndUse() {
		return endUse;
	}

	public void setEndUse(EndUseEnum endUse) {
		this.endUse = endUse;
	}

	public String getFundRequiredDate() {
		return fundRequiredDate;
	}

	public void setFundRequiredDate(String fundRequiredDate) {
		this.fundRequiredDate = fundRequiredDate;
	}

	public String getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public CreditRequirement getCreditRequirement() {
		return creditRequirement;
	}

	public void setCreditRequirement(CreditRequirement creditRequirement) {
		this.creditRequirement = creditRequirement;
	}
    
    
}

