package com.codeIntern.pumbkin.services.impl;

import com.codeIntern.pumbkin.model.IncomeDetails;
import com.codeIntern.pumbkin.repo.IncomeDetailRepo;
import com.codeIntern.pumbkin.services.IncomeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class IncomeDetailImpl implements IncomeDetailService {

    @Autowired
    IncomeDetailRepo incomeDetailRepo;
    @Override
    public IncomeDetails addIncomeDetails(IncomeDetails incomeDetails) {
        return incomeDetailRepo.save(incomeDetails);
    }

    @Override
    public Optional<IncomeDetails> findbyId(Long incomeId) {
        return incomeDetailRepo.findById(incomeId);
    }

    @Override
    public byte[] store(MultipartFile file) {
        return new byte[0];
    }


}
