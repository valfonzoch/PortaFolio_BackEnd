
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Company;
import com.Backend.Vanessa.model.Persona;
import com.Backend.Vanessa.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService  implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    @Autowired
    public CompanyService compServ;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per); 
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void agregarCompany(Company comp, Persona per) {
    Company comp_id = compServ.crearCompany(comp);
    per.addCompany(comp_id);
    persoRepo.save(per);
    }
}
