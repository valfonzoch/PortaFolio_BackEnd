
package com.Backend.Vanessa.service;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository EduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return EduRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion edu) {
       return EduRepo.save(edu);
    }

    @Override
    public void borrarEduaccion(Long id) {
      EduRepo.deleteById(id);   //lo necesito publico para que persona lo llame//
    }

    @Override
    public Educacion buscarEducacion(Long id) {
       return EduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarEducacion(Educacion edu){
        EduRepo.save(edu);
    }
     
}
