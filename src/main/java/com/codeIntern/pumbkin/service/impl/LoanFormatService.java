//Nitish Kumar
package com.codeIntern.pumbkin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeIntern.pumbkin.model.CreditRequirement;
import com.codeIntern.pumbkin.model.LoanFormatChoice;
import com.codeIntern.pumbkin.repo.LoanFormatRepository;

@Service
public class LoanFormatService {

    @Autowired
    private CreditRequirementService requirementService;

    @Autowired
    private LoanFormatRepository repo;

    public void saveLoanFormat(Integer requirementId, LoanFormatChoice dto) {
        CreditRequirement cr = requirementService.getById(requirementId);
        dto.setCreditRequirement(cr);
        repo.save(dto);
    }

	public List<LoanFormatChoice> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public LoanFormatChoice getOne(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
}
