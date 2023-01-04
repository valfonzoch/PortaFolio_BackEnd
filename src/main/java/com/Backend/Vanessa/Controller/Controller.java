
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.model.College;
import com.Backend.Vanessa.model.Company;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.model.Persona;
import com.Backend.Vanessa.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ; 
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
     return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
          persoServ.borrarPersona(id);
        }
    @PostMapping("new/company/{id}")
    public void crearCompany(@RequestBody Company com, @PathVariable Persona id){
      persoServ.agregarCompany(com, id);
    }
    @PostMapping("new/college/{id}")
    public void crearCollege(@RequestBody College cole, @PathVariable Persona id){
      persoServ.agregarCollege(cole, id);
    }
    @PostMapping("new/certificaciones/{id}")
    public void crearCertificaciones(@RequestBody Certificaciones certi, @PathVariable Persona id){
      persoServ.agregarCertificaciones(certi, id);
    }
    @PostMapping("new/educacion/{id}")
    public void crearEducacion(@RequestBody Educacion edu, @PathVariable Persona id){
      persoServ.agregarEducacion(edu, id);
    }
    @PostMapping("new/experienia/{id}")
    public void crearExperiencia(@RequestBody Experiencia exp, @PathVariable Persona id){
      persoServ.agregarExperiencia(exp, id);
    }
}