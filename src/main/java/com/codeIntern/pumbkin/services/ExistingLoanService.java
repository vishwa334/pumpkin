package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.ExistingLoan;

import java.util.Optional;

public interface ExistingLoanService {

    ExistingLoan saveLoanDetail(ExistingLoan existingLoan);

    Optional<ExistingLoan> getById(String id);
}
