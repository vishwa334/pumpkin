package com.codeIntern.pumbkin.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TypeEnum {
    REAL_ESTATE_ASSET,
    GOLD,
    BUSINESS_INVENTORY,
    MACHINERY_AND_EQUIPMENT,
    EQUITIES_AND_MUTUAL_FUND,
    SOVEREIGN_BONDS;
    
    @JsonCreator
    public static TypeEnum fromString(String value) {
        return TypeEnum.valueOf(value.trim().toUpperCase().replace(" ", "_"));
    }
}
