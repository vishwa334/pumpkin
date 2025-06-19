package com.codeIntern.pumbkin.controller;

import com.codeIntern.pumbkin.model.ExistingLoan;
import com.codeIntern.pumbkin.services.ExistingLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

//this controller for existing loan details
@RestController
public class ExistingLoanController {
    @Autowired
    ExistingLoanService existingLoanService;
    //this api save the loan only for testing purpose
    @PostMapping("/loan")
    public ExistingLoan saveLoan(@RequestBody ExistingLoan existingLoan){

        return existingLoanService.saveLoanDetail(existingLoan);
    }


    //this api fetch the existing loan details @vishwakarma
    @GetMapping("/existingLoan/{id}")
    public Optional<ExistingLoan> getById(@PathVariable("id") String id){
        return existingLoanService.getById(id);
    }



}
