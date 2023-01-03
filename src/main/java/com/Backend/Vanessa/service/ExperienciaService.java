
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository ExpRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return ExpRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        ExpRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExpRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExpRepo.findById(id).orElse(null);
    }
    
}
