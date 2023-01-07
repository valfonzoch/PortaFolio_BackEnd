
package com.Backend.Vanessa.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String backImagen;
    private String imagen;
    private String position;  
    private String location;
    private String title1;
    private String about;
    private String title2;
    private String email;
    private String password;
    
    @OneToMany
    List<Company> listCompany;
    
    @OneToMany
    List<College> listCollege;
    
    @OneToMany
    List<Experiencia> listExperiencia;
    
    @OneToMany
    List<Educacion> listEducacion;
    
    @OneToMany
    List<Certificaciones> listCertificaciones;
    

    public Persona() {
    }

    public Persona(Long id, String name, String backImagen, String imagen, String position, String location, String title1, String about, String title2, String email, String password) {
        this.id = id;
        this.name = name;
        this.backImagen = backImagen;
        this.imagen = imagen;
        this.position = position;
        this.location = location;
        this.title1 = title1;
        this.about = about;
        this.title2 = title2;
        this.email = email;
        this.password = password;
    }
    
        public void addCompany (Company comp){
            this.listCompany.add(comp);
        }
        public void addCollege (College cole){
            this.listCollege.add(cole);
        }
        public void addExperiencia (Experiencia exp){
            this.listExperiencia.add(exp);
        }
        public void addEducacion (Educacion edu){
            this.listEducacion.add(edu);
        }
        public void addCertificaciones (Certificaciones cert){
            this.listCertificaciones.add(cert);
        }
        
}
