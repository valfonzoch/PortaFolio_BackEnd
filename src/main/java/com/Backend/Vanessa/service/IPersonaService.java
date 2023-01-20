
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id); 
    public void agregarCertificaciones (Certificaciones cer, Persona per);
    public void agregarEducacion (Educacion edu, Persona per);
    public void agregarExperiencia (Experiencia exp, Persona per);
    
    
    
    
}
