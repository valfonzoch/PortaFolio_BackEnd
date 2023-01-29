
package com.Backend.Vanessa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)
    private Long id;
    
    private String about;

    public AcercaDe() {
    }

    public AcercaDe(Long id, String about) {
        this.id = id;
        this.about = about;
    }
    
    
    
    
    
}
