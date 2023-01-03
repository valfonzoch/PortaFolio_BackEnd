
package com.Backend.Vanessa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String collegue;
    private String title;
    private String img;
    private String description;
    private String certificate;
    
    
    public Educacion() {
    }

    public Educacion(Long id, String collegue, String title, String img, String description, String certificate) {
        this.id = id;
        this.collegue = collegue;
        this.title = title;
        this.img = img;
        this.description = description;
        this.certificate = certificate;
    }
       
}
