package com.codeIntern.pumbkin.controller;

import java.util.List;
import com.codeIntern.pumbkin.service.impl.CreditRequirementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.service.impl.CreditRequirementService;

@RestController
@RequestMapping("/pumpkin")
public class CreditRequirementController {

    private final CreditRequirementServiceImpl creditRequirementServiceImpl;
	
	@Autowired
	private CreditRequirementService service;

    CreditRequirementController(CreditRequirementServiceImpl creditRequirementServiceImpl) {
        this.creditRequirementServiceImpl = creditRequirementServiceImpl;
    }
	
	@PostMapping("/create")
	public ResponseEntity<CreditRequirement> createRequirement(@RequestBody CreditRequirement creditRequirement){
		return new ResponseEntity<>(service.saveRequirement(creditRequirement),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<CreditRequirement> getAll(){
		return service.getAllRequirements();
	}
	
	public ResponseEntity<CreditRequirement> getById(@PathVariable Integer id){
		return service.getRequirementById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	

}
