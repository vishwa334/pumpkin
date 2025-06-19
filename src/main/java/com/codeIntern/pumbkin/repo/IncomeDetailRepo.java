package com.codeIntern.pumbkin.repo;

import com.codeIntern.pumbkin.model.IncomeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface IncomeDetailRepo extends JpaRepository<IncomeDetails,Long> {
}
