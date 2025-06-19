package com.codeIntern.pumbkin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.CreditRequirement;

@Service
public interface CreditRequirementService {
	public CreditRequirement saveRequirement(CreditRequirement requirement);
	public List<CreditRequirement> getAllRequirements();
	public Optional<CreditRequirement> getRequirementById(Integer id);
}
