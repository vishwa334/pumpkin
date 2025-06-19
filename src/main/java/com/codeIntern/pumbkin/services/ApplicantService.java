package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.Applicant;
import com.codeIntern.pumbkin.repo.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Amit
@Service
public class ApplicantService {
    private final ApplicantRepository repo;
    public ApplicantService(ApplicantRepository repo) { this.repo = repo; }
    public Applicant save(Applicant a) { return repo.save(a); }
    public List<Applicant> findAll() { return repo.findAll(); }

    public Optional<Applicant> findById(Long id) {
        return repo.findById(id);
    }
}
