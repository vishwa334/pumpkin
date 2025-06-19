package com.codeIntern.pumbkin.services.impl;

import com.codeIntern.pumbkin.model.CreditApplicant;
import com.codeIntern.pumbkin.model.CreditApplicantNextPage;
import com.codeIntern.pumbkin.repo.CreditApplicantNextRepo;
import com.codeIntern.pumbkin.repo.CreditApplicantRepo;
import com.codeIntern.pumbkin.services.CreditApplicantNextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditApplicantNextImpl implements CreditApplicantNextService {

    @Autowired
    CreditApplicantRepo creditApplicantRepo;

    @Autowired
    CreditApplicantNextRepo creditApplicantNextRepo;

    @Override
    public Optional<CreditApplicant> getApplicantById(Long id) {
        return creditApplicantRepo.findById(id);
    }

    @Override
    public CreditApplicantNextPage saveApplicant(CreditApplicantNextPage creditApplicantNextPage) {
       return creditApplicantNextRepo.save(creditApplicantNextPage);
    }
}
