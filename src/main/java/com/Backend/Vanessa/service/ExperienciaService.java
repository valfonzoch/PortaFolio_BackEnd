
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.model.Persona;
import com.Backend.Vanessa.repository.ExperienciaRepository;
import com.Backend.Vanessa.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository ExpRepo;
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return ExpRepo.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
       return  ExpRepo.save(exp);
    }

   @Override
    public void borrarExperiencia(Experiencia exp) {
        ExpRepo.delete(exp);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExpRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExperiencia (Experiencia exp){
        ExpRepo.save(exp);
    }
    
    
}
