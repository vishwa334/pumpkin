package com.codeIntern.pumbkin.services.impl;

import com.codeIntern.pumbkin.model.ExistingLoan;
import com.codeIntern.pumbkin.repo.ExistingLoanRepo;
import com.codeIntern.pumbkin.services.ExistingLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExistingLoanImpl implements ExistingLoanService {

    @Autowired
    ExistingLoanRepo existingLoanRepo;
    @Override
    public ExistingLoan saveLoanDetail(ExistingLoan existingLoan) {
        return existingLoanRepo.save(existingLoan);
    }

    @Override
    public Optional<ExistingLoan> getById(String id) {
        return existingLoanRepo.findById(id);
    }
}
