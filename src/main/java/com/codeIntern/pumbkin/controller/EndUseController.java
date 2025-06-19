//Nitish Kumar
package com.codeIntern.pumbkin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeIntern.pumbkin.model.EndUseDetail;
import com.codeIntern.pumbkin.service.impl.EndUseService;

//EndUseController manage EndUseDetail Web services 
@RestController
@RequestMapping("/pumpkin/loan-details")
public class EndUseController {

    @Autowired
    private EndUseService service;

//    Add EndUse details using api : http://localhost:8081/pumpkin/loan-details/1
    @PostMapping("/{requirementId}")
    public ResponseEntity<?> saveLoanDetails(@PathVariable Integer requirementId, @RequestBody EndUseDetail details) {
        service.saveLoanDetails(requirementId, details);
        return ResponseEntity.ok("Loan details saved"); //Return after add
    }
    
//    Get all user Loan Fund details api : http://localhost:8081/pumpkin/loan-details/get
    @GetMapping("/get")
    public ResponseEntity<List<EndUseDetail>> getAllLoanDetails() {
        return ResponseEntity.ok(service.getAll()); //Return Loan Details of all users
    }
    
//  Get particular user Loan Fund details api : http://localhost:8081/pumpkin/loan-details/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<EndUseDetail> getLoanDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getOne(id)); //Return loan details of particular user
    }

}

