package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LoanFormatEnum {
	 BUSINESS_LOAN_UNSECURED,
	    CGTMSE_LOAN,
	    SECURED_TERM_WORKING,
	    SECURED_TERM_RETAIL,
	    OVERDRAFT_WORKING,
	    DROPLINE_RETAIL,
	    CASH_CREDIT;
	
	  @JsonCreator
	    public static LoanFormatEnum fromString(String value) {
	        return LoanFormatEnum.valueOf(value.trim().toUpperCase().replace(" ", "_"));
	    }
}
