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

import com.codeIntern.pumbkin.model.Collateral;
import com.codeIntern.pumbkin.model.EndUseDetail;
import com.codeIntern.pumbkin.service.impl.CollateralService;

//CollateralController manage Collateral Web services 
@RestController
@RequestMapping("/pumpkin/collateral")
public class CollateralController {

    @Autowired
    private CollateralService service;

//    add collateral data using api ex : http://localhost:8081/pumpkin/collateral/1
    @PostMapping("/{requirementId}")
    public ResponseEntity<?> saveCollateral(@PathVariable Integer requirementId, @RequestBody Collateral collateral) {
    	
        service.saveCollateral(requirementId, collateral);
        return ResponseEntity.ok("Collateral saved"); //Return after add details string
    }
    
    
//    Get all data from Collateral table using api : http://localhost:8081/pumpkin/collateral/get
    @GetMapping("/get")
    public ResponseEntity<List<Collateral>> getAllCollateralDetails() {
        return ResponseEntity.ok(service.getAll()); //Return list of data with status ok(200)
    }
    
//  Get single data using id from Collateral table using api : http://localhost:8081/pumpkin/collateral/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<Collateral> getCollateralDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getOne(id)); //Return single data with status ok(200)
    }
}

