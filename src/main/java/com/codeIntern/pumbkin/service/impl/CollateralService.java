//Nitish Kumar
package com.codeIntern.pumbkin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.Collateral;
import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.repo.CollateralRepository;

@Service
public class CollateralService {

    @Autowired
    private CreditRequirementService service;

    @Autowired
    private CollateralRepository repo;

    public void saveCollateral(Integer requirementId, Collateral collateral) {
        CreditRequirement cr = service.getById(requirementId);
        collateral.setCreditRequirement(cr);
        repo.save(collateral);
    }
    
    public List<Collateral> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Collateral getOne(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
}

