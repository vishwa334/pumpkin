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

@Entity
@Table

public class CreditRequirement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	    private String loanPurpose;
	    private String loanDuration;
	    private Double loanAmount;
	    private String fundRequiredDate;

	    @OneToOne(cascade = CascadeType.ALL)
	    private Collateral collateral;

	    @Enumerated(EnumType.STRING)
	    private LoanFormat loanFormat;
	    
	    @Enumerated(EnumType.STRING)
	    private EndUserFormat endUserFormat;

		public String getLoanPurpose() {
			return loanPurpose;
		}

		public void setLoanPurpose(String loanPurpose) {
			this.loanPurpose = loanPurpose;
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

		public String getFundRequiredDate() {
			return fundRequiredDate;
		}

		public void setFundRequiredDate(String fundRequiredDate) {
			this.fundRequiredDate = fundRequiredDate;
		}

		public Collateral getCollateral() {
			return collateral;
		}

		public void setCollateral(Collateral collateral) {
			this.collateral = collateral;
		}

		public LoanFormat getLoanFormat() {
			return loanFormat;
		}

		public void setLoanFormat(LoanFormat loanFormat) {
			this.loanFormat = loanFormat;
		}

		public EndUserFormat getEndUserFormat() {
			return endUserFormat;
		}

		public void setEndUserFormat(EndUserFormat endUserFormat) {
			this.endUserFormat = endUserFormat;
		}

		@Override
		public String toString() {
			return "CreditRequirement [id=" + id + ", loanPurpose=" + loanPurpose + ", loanDuration=" + loanDuration
					+ ", loanAmount=" + loanAmount + ", fundRequiredDate=" + fundRequiredDate + ", collateral="
					+ collateral + ", loanFormat=" + loanFormat + ", endUserFormat=" + endUserFormat + "]";
		}
	    
		
	    
}
