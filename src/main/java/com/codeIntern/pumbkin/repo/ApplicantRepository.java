package com.codeIntern.pumbkin.repo;

import com.codeIntern.pumbkin.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Amit
@Repository
public  interface  ApplicantRepository  extends JpaRepository<Applicant,Long>{

}
