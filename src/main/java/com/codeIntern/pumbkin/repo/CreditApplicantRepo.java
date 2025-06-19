package com.codeIntern.pumbkin.repo;


import com.codeIntern.pumbkin.model.CreditApplicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
public interface CreditApplicantRepo  extends JpaRepository<CreditApplicant,Long>{
}
