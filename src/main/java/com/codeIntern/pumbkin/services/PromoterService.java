package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.Promoter;
import com.codeIntern.pumbkin.model.SocialReference;
import com.codeIntern.pumbkin.repo.PromoterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Amit
@Service
public class PromoterService {
    private final PromoterRepository promoterRepository;

    public PromoterService(PromoterRepository promoterRepository) {
        this.promoterRepository = promoterRepository;
    }

    public Promoter savePromoter(Promoter promoter) {
        if (promoter.getSocialReferences() != null) {
            for (SocialReference sr : promoter.getSocialReferences()) {
                sr.setPromoter(promoter); // 🔗 Link back to parent
            }
        }
        return promoterRepository.save(promoter);
    }

    public List<Promoter> getAllPromoters() {
        return promoterRepository.findAll();
    }

    public Promoter getPromoterById(Long id) {
        return promoterRepository.findById(id).orElse(null);
    }
}
