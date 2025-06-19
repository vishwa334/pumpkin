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
//  This is for   creating new Promoters //
    @PostMapping
    public ResponseEntity<Promoter> addPromoter(@RequestBody Promoter promoter) {
        return ResponseEntity.ok(promoterService.savePromoter(promoter));
    }

    // This endpoint returns a list of all promoter records from the database.
    @GetMapping
    public ResponseEntity<List<Promoter>> getAllPromoters() {
        return ResponseEntity.ok(promoterService.getAllPromoters());
    }

    // This endpoint returns the promoter with the specified ID.
// If the promoter is not found, it should throw a custom NotFound exception (handled separately).
    @GetMapping("/{id}")
    public ResponseEntity<Promoter> getPromoterById(@PathVariable Long id) {
        return ResponseEntity.ok(promoterService.getPromoterById(id));

    }
}
