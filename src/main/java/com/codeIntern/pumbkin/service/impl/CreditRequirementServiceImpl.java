package com.codeIntern.pumbkin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.repo.CreditRequirementRepository;

@Service
public class CreditRequirementServiceImpl implements CreditRequirementService {
	@Autowired
	private CreditRequirementRepository repository;
	
	public CreditRequirement saveRequirement(CreditRequirement requirement) {
		return repository.save(requirement);
	}
	
	public List<CreditRequirement> getAllRequirements(){
		return repository.findAll();
	}
	
	public Optional<CreditRequirement> getRequirementById(Integer id){
		return repository.findById(id);
	}
}
