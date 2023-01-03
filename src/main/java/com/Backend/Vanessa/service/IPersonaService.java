
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Company;
import com.Backend.Vanessa.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id); 
    public void agregarCompany (Company comp, Persona per);
    
    
    
}
