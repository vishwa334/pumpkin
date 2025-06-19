package com.codeIntern.pumbkin.controllers;


import com.codeIntern.pumbkin.model.Promoter;
import com.codeIntern.pumbkin.services.PromoterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Amit
@RestController
@RequestMapping("/api/promoters")
public class PromoterController {


    private final PromoterService promoterService;

    public PromoterController(PromoterService promoterService) {
        this.promoterService = promoterService;
    }

    @PostMapping
    public ResponseEntity<Promoter> addPromoter(@RequestBody Promoter promoter) {
        return ResponseEntity.ok(promoterService.savePromoter(promoter));
    }

    @GetMapping
    public ResponseEntity<List<Promoter>> getAllPromoters() {
        return ResponseEntity.ok(promoterService.getAllPromoters());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promoter> getPromoterById(@PathVariable Long id) {
        return ResponseEntity.ok(promoterService.getPromoterById(id));
    }
}
