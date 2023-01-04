
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia ();
    public Experiencia crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id); 
     
}
