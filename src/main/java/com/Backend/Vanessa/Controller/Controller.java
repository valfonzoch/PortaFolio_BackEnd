
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.model.Credenciales;
import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.model.Persona;
import com.Backend.Vanessa.service.ICertificacionesService;
import com.Backend.Vanessa.service.IEducacionService;
import com.Backend.Vanessa.service.IExperienciaService;
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
    @Autowired
    private IExperienciaService expServ;
    @Autowired
    private ICertificacionesService cerServ;
   
    //Login
    @PostMapping("/login")
    public Boolean login (@RequestBody Credenciales cred){
    return persoServ.login(cred.getPassword(), cred.getEmail());
    }
    
    
    //Persona
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    @GetMapping ("/ver/persona/{id}")
     public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    } 
    @PutMapping("update/persona")
    public void editarPersona (@RequestBody Persona per){
    persoServ.editarPersona(per);
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
          persoServ.borrarPersona(id);
    }
    
   //Educacion
    @PostMapping("new/educacion/{id}")
    public void crearEducacion(@RequestBody Educacion edu, @PathVariable Persona id){
      persoServ.agregarEducacion(edu, id); 
    } 
    @GetMapping("/ver/educacion/{id}")
    public Educacion buscarEducacion (@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    @PutMapping ("update/educacion")
    public void editarEducacion (@RequestBody Educacion edu){
      eduServ.editarEducacion(edu);
    }
    @DeleteMapping ("delete/educacion/{idedu}/{idper}")
    public void borrarEducacion(@PathVariable Educacion idedu, @PathVariable Persona idper){
        persoServ.borrarEducacion(idedu,idper);
    }
    
   //Experiecia
    @PostMapping("new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experiencia exp, @PathVariable Persona id){
      persoServ.agregarExperiencia(exp, id);
    } 
     @GetMapping("/ver/experiencia/{id}")
    public Experiencia buscarExperiencia (@PathVariable Long id){
       return expServ.buscarExperiencia(id);
    }
    @PutMapping ("update/experiencia")
    public void editarExperiencia (@RequestBody Experiencia exp){
      expServ.editarExperiencia(exp);
    }
    @DeleteMapping ("delete/experiencia/{idexp}/{idper}")
    public void borrarExperiencia(@PathVariable Experiencia idexp, @PathVariable Persona idper){
        persoServ.borrarExperiencia(idexp,idper);
    }
    
   
    //Certificaciones
    @PostMapping("new/certificaciones/{id}")
    public void crearCertificaciones(@RequestBody Certificaciones cer, @PathVariable Persona id){
      persoServ.agregarCertificaciones(cer, id);
    } 
    @GetMapping("/ver/certificaciones/{id}")
    public Certificaciones buscarCertificaciones (@PathVariable Long id){
       return  cerServ.buscarCertificaciones(id);
    }
    @PutMapping ("update/certificaciones")
    public void editarCertificaciones (@RequestBody Certificaciones cer){
        cerServ.editarCertificaciones(cer);
    }
    @DeleteMapping ("delete/certificaciones/{idcer}/{idper}")
    public void borrarCertificaciones(@PathVariable Certificaciones idcer, @PathVariable Persona idper){
        persoServ.borrarCertificaciones(idcer,idper);
    }
    
}


