
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.model.College;
import com.Backend.Vanessa.model.Company;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.model.Experiencia;
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
    @Autowired
    public CollegeService coleServ;
   
    @Autowired
    public EducacionService eduServ;
    @Autowired
    public ExperienciaService expServ;
    @Autowired
    public CertificacionesService cerServ;

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
    @Override
    public void agregarCollege(College cole, Persona per) {
    College cole_id = coleServ.crearCollege(cole);
    per.addCollege(cole_id);
    persoRepo.save(per);
    }
    @Override
    public void agregarCertificaciones(Certificaciones cer, Persona per) {
    Certificaciones cer_id = cerServ.crearCertificaciones(cer);
    per.addCertificaciones(cer_id);
    persoRepo.save(per);
    }
    @Override
    public void agregarEducacion(Educacion edu, Persona per) {
    Educacion edu_id = eduServ.crearEducacion(edu);
    per.addEducacion(edu_id);
    persoRepo.save(per);
    }
    @Override
    public void agregarExperiencia(Experiencia exp, Persona per) {
    Experiencia exp_id = expServ.crearExperiencia(exp);
    per.addExperiencia(exp_id);
    persoRepo.save(per);
    }
   
}
