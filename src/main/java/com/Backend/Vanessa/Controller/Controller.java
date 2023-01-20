
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Certificaciones;
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
    @GetMapping ("/ver/persona/{id}")
     public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    } 
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
          persoServ.borrarPersona(id);
        }
    
    @PostMapping("new/educacion/{id}")
    public void crearEducacion(@RequestBody Educacion edu, @PathVariable Persona id){
      persoServ.agregarEducacion(edu, id);
    } 
    @PostMapping("new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experiencia exp, @PathVariable Persona id){
      persoServ.agregarExperiencia(exp, id);
    } 
    @PostMapping("new/certificaciones/{id}")
    public void crearCertificaciones(@RequestBody Certificaciones cer, @PathVariable Persona id){
      persoServ.agregarCertificaciones(cer, id);
    } 
    
}