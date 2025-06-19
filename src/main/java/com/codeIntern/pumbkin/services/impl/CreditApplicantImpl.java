package com.codeIntern.pumbkin.services.impl;

import com.codeIntern.pumbkin.model.CreditApplicant;

import com.codeIntern.pumbkin.repo.CreditApplicantRepo;
import com.codeIntern.pumbkin.services.CreditApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditApplicantImpl implements CreditApplicantService {


    @Autowired
    CreditApplicantRepo creditApplicantRepo;


    @Override
    public CreditApplicant lead(CreditApplicant creditApplicant) {
        return creditApplicantRepo.save(creditApplicant);
    }

    @Override
    public List<CreditApplicant> getAllCreditApplicant() {
        return creditApplicantRepo.findAll();
    }

    @Override
    public Optional<CreditApplicant> getById(Long id) {
        return creditApplicantRepo.findById(id);
    }
}
