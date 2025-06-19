//Nitish Kumar
package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

//Model class of Collateral that store data related to collateral
//POJO class
@Entity
public class Collateral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TypeEnum type; //Match the value from TypeEnum enumerator class

    private String purchaseDate;
    private Double purchaseValue;
    private Double marketValue;
    private String description;

  //It is one to one relation establish and using @JsonIgnore for don't get data of this field. using join to map the tables
    @OneToOne
    @JoinColumn(name = "credit_requirement_id")
    @JsonIgnore
    private CreditRequirement creditRequirement; 

//    Getter Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Double getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(Double purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CreditRequirement getCreditRequirement() {
		return creditRequirement;
	}

	public void setCreditRequirement(CreditRequirement creditRequirement) {
		this.creditRequirement = creditRequirement;
	}
    
    
}