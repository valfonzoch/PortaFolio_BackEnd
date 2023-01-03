
package com.Backend.Vanessa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Company {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String img;
    private String url;

    public Company() {
    }

    public Company(Long id, String name, String img, String url) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.url = url;
    }
    
    
    
}
