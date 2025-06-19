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

import com.codeIntern.pumbkin.model.LoanFormatChoice;
import com.codeIntern.pumbkin.service.impl.LoanFormatService;

//LoanFormatController use to manage loan format  details
@RestController
@RequestMapping("/pumpkin/loan-format")
public class LoanFormatController {

    @Autowired
    private LoanFormatService service;

//    Add the format of loan into database api : http://localhost:8081/pumpkin/loan-format/1
    @PostMapping("/{requirementId}")
    public ResponseEntity<?> saveLoanFormat(@PathVariable Integer requirementId, @RequestBody LoanFormatChoice dto) {
        service.saveLoanFormat(requirementId, dto);
        return ResponseEntity.ok("Loan format saved");
    } 
    
//    Get all the user loan format using api : http://localhost:8081/pumpkin/loan-format/get
    @GetMapping("/get")
    public ResponseEntity<List<LoanFormatChoice>> getAllLoanFormate(){
    	return ResponseEntity.ok(service.getAll());
    }
    
//    Get particular user loan format using api : http://localhost:8081/pumpkin/loan-format/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<LoanFormatChoice> getLoanFormateById(@PathVariable Integer id){
    	return ResponseEntity.ok(service.getOne(id));
    }
}

