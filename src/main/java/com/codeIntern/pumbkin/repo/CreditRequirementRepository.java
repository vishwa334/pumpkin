package com.codeIntern.pumbkin.repo;

import org.springframework.stereotype.Repository;

import com.codeIntern.pumbkin.model.CreditRequirement;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CreditRequirementRepository extends JpaRepository<CreditRequirement, Integer>{

}
