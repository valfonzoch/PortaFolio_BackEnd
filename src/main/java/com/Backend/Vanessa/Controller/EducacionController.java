
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Educacion;
import com.Backend.Vanessa.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ; 
    
   
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
     return eduServ.verEducacion();
    }
    
   
    
   
}