package com.codeIntern.pumbkin.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


// Amit
@Entity
public class SocialReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String socialNetwork;
    private String url;



    @ManyToOne
    @JoinColumn(name = "promoter_id")
    @JsonBackReference
    private Promoter promoter;



    //  Setter method (automatically available if you use Lombok @Data or write it manually)




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Promoter getPromoter() {
        return promoter;
    }

    public void setPromoter(Promoter promoter) {
        this.promoter = promoter;
    }
    public  SocialReference(){
    }
    public SocialReference(Long id, String socialNetwork, String url, Promoter promoter) {
        this.id = id;
        this.socialNetwork = socialNetwork;
        this.url = url;
        this.promoter = promoter;
    }

    @Override
    public String toString() {
        return "SocialReference{" +
                "id=" + id +
                ", socialNetwork='" + socialNetwork + '\'' +
                ", url='" + url + '\'' +
                ", promoter=" + promoter +
                '}';
    }
}
