
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
    private String company; 
    private String college; 
    private String location;
    private String title1;
    private String about;
    private String title2;
    private String email;
    private String password;
        
    @OneToMany
    List<Experiencia> listExperiencia;
    
    @OneToMany
    List<Educacion> listEducacion;
    
    @OneToMany
    List<Certificaciones> listCertificaciones;
    

    public Persona() {
    }

    public Persona(Long id, String name, String backImagen, String imagen, String position, String company, String college, String location, String title1, String about, String title2, String email, String password) {
        this.id = id;
        this.name = name;
        this.backImagen = backImagen;
        this.imagen = imagen;
        this.position = position;
        this.company = company;
        this.college = college;
        this.location = location;
        this.title1 = title1;
        this.about = about;
        this.title2 = title2;
        this.email = email;
        this.password = password;
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
        
        public void deleteExperiencia (Experiencia exp){
            
            for(Experiencia aux : this.listExperiencia ){
            if(aux.equals(exp)){
                this.listExperiencia.remove(exp);
                break;
            }
            
            }
            
        }
        
        
        
        
     /*   
        public void removerExperiencia(Experiencia var){
        
        for(Experiencia aux : this.listaExperiencia ){
            if(aux.equals(var)){
                this.listaExperiencia.remove(var);
                break;
            }
        }
    }
        
        
        
        public boolean equals(String user){
    
        return (this.usuario == null ? user == null : this.usuario.equals(user));
        }
    
        public boolean igual(String clave){
    
        return (this.password == null ? password == null : this.password.equalsIgnoreCase(clave));
        }
        
        public boolean equals(String user){
    
       return (this.usuario == null ? user == null : this.usuario.equals(user));
        }
    
        public boolean igual(String clave){
    
       return (this.password == null ? password == null : this.password.equalsIgnoreCase(clave));
    }*/
        
}
