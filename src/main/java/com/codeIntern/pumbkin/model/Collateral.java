package com.codeIntern.pumbkin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
public class Collateral {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String purchaseDate;
	    private Double purchaseValue;
	    private Double marketValue;
	    private String description;
	    
	    @Enumerated(EnumType.STRING)
	    private TypeEnum type;
	    
		public String getPurchaseDate() {
			return purchaseDate;
		}
		public void setPurchaseDate(String purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		public Double getPurchaseValue() {
			return purchaseValue;
		}
		public TypeEnum getType() {
			return type;
		}
		public void setType(TypeEnum type) {
			this.type = type;
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
		@Override
		public String toString() {
			return "Collateral [id=" + id + ", type=" + type + ", purchaseDate=" + purchaseDate + ", purchaseValue="
					+ purchaseValue + ", marketValue=" + marketValue + ", description=" + description + "]";
		}
	    
	    
}
