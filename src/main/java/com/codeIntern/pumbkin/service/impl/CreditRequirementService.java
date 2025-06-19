//Nitish Kumar
package com.codeIntern.pumbkin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.repo.CreditRequirementRepository;

@Service
public class CreditRequirementService {

    @Autowired
    private CreditRequirementRepository repository;

    public CreditRequirement createEmptyRequirement() {
        CreditRequirement cr = new CreditRequirement();
        return repository.save(cr);
    }

    public CreditRequirement getById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Requirement not found"));
    }
    
    public List<CreditRequirement> getAllRequirements() {
        return repository.findAll();
    }

	public CreditRequirement getRequirementById(Integer id) {
		
		return repository.findById(id).get();
	}
	
	 public CreditRequirement getFullApplication(Integer id) {
	        CreditRequirement cr = repository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Not found"));

	        CreditRequirement response = new CreditRequirement();
	        response.setId(cr.getId());

	        response.setLoanDetails(cr.getLoanDetails());
	        response.setLoanFormatChoice(cr.getLoanFormatChoice());
	        response.setCollateral(cr.getCollateral());

	        return response;
	    }

}

