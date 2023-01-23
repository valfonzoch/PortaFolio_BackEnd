
package com.Backend.Vanessa.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Certificaciones {
     @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
     
    private String school;
    private String img;
    private String title;
    private String expedition;
    private String certificate; 

    public Certificaciones() {
    }

    public Certificaciones(Long id, String school, String img, String title, String expedition, String certificate) {
        this.id = id;
        this.school = school;
        this.img = img;
        this.title = title;
        this.expedition = expedition;
        this.certificate = certificate;
    }
 
}
