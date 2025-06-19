package com.codeIntern.pumbkin.controller;

import com.codeIntern.pumbkin.model.CreditApplicant;
import com.codeIntern.pumbkin.model.CreditApplicantNextPage;
import com.codeIntern.pumbkin.services.CreditApplicantNextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//this page for credit applicant next page to fetch the data and next save it @vishwakarma
@RestController
public class CreditApplicantNextController {

    @Autowired
    CreditApplicantNextService creditApplicantNextService;

    //this api for fetch the entire data of creditapplicant previous page
    @GetMapping("/fetch/{id}")
    public Optional<CreditApplicant> fetchDetails(@PathVariable("id") Long id){

        return creditApplicantNextService.getApplicantById(id);

    }

    //this api save the entire application for save all details @Vishwakarma
    @PostMapping("/saveApplicant")
    public CreditApplicantNextPage saveApplicant(@RequestBody CreditApplicantNextPage creditApplicantNextPage){
        return creditApplicantNextService.saveApplicant(creditApplicantNextPage);
    }
}
