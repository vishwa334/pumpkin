package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.IncomeDetails;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

public interface IncomeDetailService {

    IncomeDetails addIncomeDetails(IncomeDetails incomeDetails);

    Optional<IncomeDetails> findbyId(Long incomeId);

    public byte[] store(MultipartFile file) ;
}
