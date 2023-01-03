
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Company;
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
}