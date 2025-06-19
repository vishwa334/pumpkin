package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.CreditApplicant;
import com.codeIntern.pumbkin.model.CreditApplicantNextPage;

import java.util.Optional;


public interface CreditApplicantNextService {

    Optional<CreditApplicant> getApplicantById(Long id);

    CreditApplicantNextPage saveApplicant(CreditApplicantNextPage creditApplicantNextPage);
}
