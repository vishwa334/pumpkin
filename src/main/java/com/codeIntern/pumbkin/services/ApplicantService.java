package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.Applicant;
import com.codeIntern.pumbkin.repo.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Amit  //
@Service
public class ApplicantService {
    //  In this service only business logic for get Request and  post  request further , we can added for delete, put and patch request //
    private final ApplicantRepository repo;
    public ApplicantService(ApplicantRepository repo) { this.repo = repo; }
    public Applicant save(Applicant a) { return repo.save(a); }
    public List<Applicant> findAll() { return repo.findAll(); }

    public Optional<Applicant> findById(Long id) {
        return repo.findById(id);
    }
}
