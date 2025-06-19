package com.codeIntern.pumbkin.controller;

import com.codeIntern.pumbkin.model.IncomeDetails;
import com.codeIntern.pumbkin.services.IncomeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.util.Optional;

//this page for income and revenue details
@RestController
public class IncomeDetailController {


    @Autowired
    IncomeDetailService incomeDetailService;

  //here we save the all details of revenue and income
    @PostMapping(value = "/incomeSave", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> save(@PathVariable Long incomeId,
                                              @RequestParam("data") IncomeDetails incomeDetails,
                                              @RequestParam("cancelCheque") MultipartFile cancelCheque,
                                              @RequestParam("bankStatement") MultipartFile bankStatement
    ) {

        //here we add the file like pdf,jpg,etc.
        incomeDetails.setCancelCheque(incomeDetailService.store(cancelCheque));
        incomeDetails.setBankStatement(incomeDetailService.store(bankStatement));
        incomeDetails.setCancelCheque(cancelCheque.getOriginalFilename().getBytes());
        incomeDetails.setBankStatement(bankStatement.getOriginalFilename().getBytes());

        incomeDetailService.addIncomeDetails(incomeDetails);

        return ResponseEntity.ok("Files uploaded successfully");

    }
}
