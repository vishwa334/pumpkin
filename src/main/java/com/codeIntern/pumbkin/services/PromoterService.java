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

    // Save a promoter along with its associations //
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

        //Link executive associations to the promoter (parent)  //

        if (promoter.getExecutiveAssociations() != null) {
            for (ExecutiveAssociation ea : promoter.getExecutiveAssociations()) {
                ea.setPromoter(promoter);
            }
        }
        //  Save the promoter along with the linked child entities  //
        return promoterRepository.save(promoter);
    }
//  Getting all the promoters from the databases //
    public List<Promoter> getAllPromoters() {
        return promoterRepository.findAll();
    }

//getting promoter  by id //
    public Promoter getPromoterById(Long id) {
        return promoterRepository.findById(id).orElse(null);
    }
}
