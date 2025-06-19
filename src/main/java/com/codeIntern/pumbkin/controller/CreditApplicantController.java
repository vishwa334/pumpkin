package com.codeIntern.pumbkin.controller;

import com.codeIntern.pumbkin.model.CreditApplicant;
import com.codeIntern.pumbkin.services.CreditApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//this controller for list the credit application  @vishwakarma
@RestController
public class CreditApplicantController {

    @Autowired
    CreditApplicantService creditApplicantService;



//here we save the details of credit applicant only for testing purpose
    @PostMapping("/save")
    public CreditApplicant save(@RequestBody CreditApplicant creditApplicant){
        return creditApplicantService.lead(creditApplicant);
    }

    //here we find the all credit applicant
    @GetMapping("/getApplicant")
    public List<CreditApplicant> getAllApplicant(){
        return creditApplicantService.getAllCreditApplicant();
    }

    //here we find the specific credit applicant or use this api for single applicant view or update
    @GetMapping("/view/{id}")
    public Optional<CreditApplicant> viewDetails(@PathVariable("id") Long id){
        return creditApplicantService.getById(id);
    }




}
