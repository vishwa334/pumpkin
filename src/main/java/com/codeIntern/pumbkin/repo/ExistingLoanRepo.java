package com.codeIntern.pumbkin.repo;

import com.codeIntern.pumbkin.model.ExistingLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ExistingLoanRepo extends JpaRepository<ExistingLoan,String> {
}
