//Nitish Kumar
package com.codeIntern.pumbkin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.model.EndUseDetail;
import com.codeIntern.pumbkin.repo.EndUseRepository;

@Service
public class EndUseService {

    @Autowired
    private CreditRequirementService requirementService;

    @Autowired
    private EndUseRepository loanDetailsRepo;

    public void saveLoanDetails(Integer requirementId, EndUseDetail details) {
        CreditRequirement cr = requirementService.getById(requirementId);
        details.setCreditRequirement(cr);
        loanDetailsRepo.save(details);
    }

	public List<EndUseDetail> getAll() {
		// TODO Auto-generated method stub
		return loanDetailsRepo.findAll();
	}

	public EndUseDetail getOne(Integer id) {
		// TODO Auto-generated method stub
		return loanDetailsRepo.findById(id).get();
	}
}

