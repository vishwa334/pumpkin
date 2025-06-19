package com.codeIntern.pumbkin.repo;

import com.codeIntern.pumbkin.model.CreditApplicantNextPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CreditApplicantNextRepo extends JpaRepository<CreditApplicantNextPage, Long> {
}
