package com.codeIntern.pumbkin.services;


import com.codeIntern.pumbkin.model.CreditApplicant;

import java.util.List;
import java.util.Optional;

public interface CreditApplicantService {

    CreditApplicant lead(CreditApplicant creditApplicant);

    List<CreditApplicant> getAllCreditApplicant();

    Optional<CreditApplicant> getById(Long id);


}
