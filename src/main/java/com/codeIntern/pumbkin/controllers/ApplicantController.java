package com.codeIntern.pumbkin.controllers;

import com.codeIntern.pumbkin.model.Applicant;
import com.codeIntern.pumbkin.services.ApplicantService;
import com.codeIntern.pumbkin.services.FileUploadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;



// Amit  Kumar //

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;
    private final FileUploadService storageService;

    public ApplicantController(ApplicantService applicantService,
                               FileUploadService storageService) {
        this.applicantService = applicantService;
        this.storageService = storageService;
    }
//  This is for creating new Applicant //
    @PostMapping
    public Applicant create(@RequestBody Applicant applicant) {
        return applicantService.save(applicant);
    }

    // Get all applicants
    @GetMapping
    public List<Applicant> list() {
        return applicantService.findAll();
    }

    // Upload files for a specific applicant
    @PostMapping("/{id}/upload")
    public ResponseEntity<String> uploadFiles(@PathVariable Long id,
                                              @RequestParam("pan") MultipartFile pan,
                                              @RequestParam("aadhar") MultipartFile aadhar,
                                              @RequestParam("msme") MultipartFile msme) {
        try {
            Optional<Applicant> optionalApplicant = applicantService.findById(id);

            if (optionalApplicant.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Applicant not found");
            }

            Applicant applicant = optionalApplicant.get();
            applicant.setPanFile(storageService.store(pan));
            applicant.setAadharFile(storageService.store(aadhar));
            applicant.setMsmeFile(storageService.store(msme));

            applicant.setPanFileName(pan.getOriginalFilename());
            applicant.setAadharFileName(aadhar.getOriginalFilename());
            applicant.setMsmeFileName(msme.getOriginalFilename());

            applicantService.save(applicant);

            return ResponseEntity.ok("Files uploaded successfully");

        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading files: " + e.getMessage());
        }
    }
}
