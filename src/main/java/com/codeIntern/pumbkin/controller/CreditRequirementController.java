//Nitish Kumar
package com.codeIntern.pumbkin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.service.impl.CreditRequirementService;

 //CreditRequirementController class that create a new user give id of user
@RestController
@RequestMapping("/pumpkin/credit-requirements")
public class CreditRequirementController {

    @Autowired
    private CreditRequirementService service; 

//    This api is use to create new user id api : http://localhost:8081/pumpkin/credit-requirements
    @PostMapping
    public ResponseEntity<CreditRequirement> createNewRequirement() {
        CreditRequirement req = service.createEmptyRequirement();
        return ResponseEntity.ok(req); //Return id of user
    }
    
//    this api is use to get all users all details api : http://localhost:8081/pumpkin/credit-requirements/get
    @GetMapping("/get")
    public ResponseEntity<List<CreditRequirement>> getAll() {
        return ResponseEntity.ok(service.getAllRequirements()); //Return List of all users details
    }
    
//    this api is use to get single user all details api :http://localhost:8081/pumpkin/credit-requirements/1/full
    @GetMapping("/{id}/full")
    public ResponseEntity<CreditRequirement> getFullApp(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getFullApplication(id)); //Return single user details
    }



}
