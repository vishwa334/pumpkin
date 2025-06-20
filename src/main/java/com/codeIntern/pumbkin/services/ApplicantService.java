package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.Applicant;
import com.codeIntern.pumbkin.repo.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Amit  //
@Service
public class ApplicantService {

    private final ApplicantRepository repo;
    public ApplicantService(ApplicantRepository repo) {
        this.repo = repo;
    }

    // Exception Section is added  further when some conditions are  failing //

    //  In this service only business logic for get Request and  post  request further , we can added for delete, put and patch request //
    public Applicant save(Applicant a) {
        return repo.save(a);
    }

    // This request for getting all the applicants , here I am mot adding exception when can be further added //
    public List<Applicant> findAll() {
        return repo.findAll();
    }

    // This request for getting the applicant By id //
    public Optional<Applicant> findById(Long id) {

        return repo.findById(id);
    }
}
