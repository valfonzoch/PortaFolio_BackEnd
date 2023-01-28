
package com.Backend.Vanessa.service;


import com.Backend.Vanessa.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion ();
    public Educacion crearEducacion (Educacion edu);
    public void borrarEduaccion (Long id);
    public Educacion buscarEducacion (Long id); 
    public void editarEducacion (Educacion edu); 
    
    
}
