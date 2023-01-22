
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.model.Persona;
import com.Backend.Vanessa.service.IEducacionService;

import com.Backend.Vanessa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;   
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/persona/{id}")
     public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    } 
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
          persoServ.borrarPersona(id);
        }
    
    //me falta editar persona
    
    @PostMapping("new/educacion/{id}")
    public void crearEducacion(@RequestBody Educacion edu, @PathVariable Persona id){
      persoServ.agregarEducacion(edu, id); 
    } 
    
    @PutMapping ("update/educacion")
    public void editarEducacion (@RequestBody Educacion edu){
      eduServ.editarEducacion(edu);
    }
    
    @DeleteMapping ("delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
    eduServ.borrarEduaccion(id);
    }
    
    @GetMapping("/ver/educacion/{id}")
    public void verEducacion (@PathVariable Long id){
        eduServ.buscarEducacion(id);
    }
    
    // me falta ver y eliminar
    
    
    @PostMapping("new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experiencia exp, @PathVariable Persona id){
      persoServ.agregarExperiencia(exp, id);
    } 
    @PostMapping("new/certificaciones/{id}")
    public void crearCertificaciones(@RequestBody Certificaciones cer, @PathVariable Persona id){
      persoServ.agregarCertificaciones(cer, id);
    } 
    
}