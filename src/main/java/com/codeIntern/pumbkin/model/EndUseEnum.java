//Nitish Kumar
package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonCreator;

//Enum class 
public enum EndUseEnum {
	 ASSET_PURCHASE,
	    STARTING_NEW_BUSINESS,
	    BUSINESS_EXPANSION,
	    WORKING_CAPITAL,
	    MACHINERY_EQUIPMENT,
	    REPAYMENT_OF_OTHER_LOANS,
	    MANAGING_CASH_FLOWS,
	    MANAGING_SEASON_BUSINESS;
	
	  @JsonCreator
	    public static EndUseEnum fromString(String value) {
	        return EndUseEnum.valueOf(value.trim().toUpperCase().replace(" ", "_"));
	    }
}
