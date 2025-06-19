//Nitish kumar
package com.codeIntern.pumbkin.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Model class of CreditRequirement that store data .This model is map all data in one single unit and create new user.
//POJO class
@Entity
public class CreditRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    It map the EndUseDetail POJO class
//    using one to one relation
    @OneToOne(mappedBy = "creditRequirement", cascade = CascadeType.ALL)
    private EndUseDetail endUseDetail;

//    It map the LoanFormatChoice POJO class
//    using one to one relation
    @OneToOne(mappedBy = "creditRequirement", cascade = CascadeType.ALL)
    private LoanFormatChoice loanFormatChoice;

//    It map the Collateral POJO class
//    using one to one relation
    @OneToOne(mappedBy = "creditRequirement", cascade = CascadeType.ALL)
    private Collateral collateral;

//    Getter and Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EndUseDetail getLoanDetails() {
		return endUseDetail;
	}

	public void setLoanDetails(EndUseDetail endUseDetail) {
		this.endUseDetail = endUseDetail;
	}

	public LoanFormatChoice getLoanFormatChoice() {
		return loanFormatChoice;
	}

	public void setLoanFormatChoice(LoanFormatChoice loanFormatChoice) {
		this.loanFormatChoice = loanFormatChoice;
	}

	public Collateral getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral collateral) {
		this.collateral = collateral;
	}
    
    
}
