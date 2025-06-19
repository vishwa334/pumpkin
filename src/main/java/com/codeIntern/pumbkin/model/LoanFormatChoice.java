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

@Entity
public class LoanFormatChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private LoanFormatEnum loanFormat;

    @OneToOne
    @JoinColumn(name = "credit_requirement_id")
    @JsonIgnore
    private CreditRequirement creditRequirement;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LoanFormatEnum getLoanFormat() {
		return loanFormat;
	}

	public void setLoanFormat(LoanFormatEnum loanFormat) {
		this.loanFormat = loanFormat;
	}

	public CreditRequirement getCreditRequirement() {
		return creditRequirement;
	}

	public void setCreditRequirement(CreditRequirement creditRequirement) {
		this.creditRequirement = creditRequirement;
	}
    
    
}

