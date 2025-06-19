package com.codeIntern.pumbkin.services;

import com.codeIntern.pumbkin.model.ExecutiveAssociation;
import com.codeIntern.pumbkin.model.Promoter;
import com.codeIntern.pumbkin.model.SocialReference;
import com.codeIntern.pumbkin.repo.PromoterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Amit kumar //

@Service
public class PromoterService {
    private final PromoterRepository promoterRepository;

    public PromoterService(PromoterRepository promoterRepository) {
        this.promoterRepository = promoterRepository;
    }

    public Promoter savePromoter(Promoter promoter) {

        // Link child references
        if (promoter.getSocialReferences() != null) {
            for (SocialReference sr : promoter.getSocialReferences()) {
                sr.setPromoter(promoter);
            }
        }




//        if (promoter.getSocialReferences() != null) {
//            for (SocialReference sr : promoter.getSocialReferences()) {
//                sr.setPromoter(promoter); // 🔗 Link back to parent
//            }
//        }


        if (promoter.getExecutiveAssociations() != null) {
            for (ExecutiveAssociation ea : promoter.getExecutiveAssociations()) {
                ea.setPromoter(promoter);
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
