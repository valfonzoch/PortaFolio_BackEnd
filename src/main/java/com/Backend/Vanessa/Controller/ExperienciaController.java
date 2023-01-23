
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Experiencia;
import com.Backend.Vanessa.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController
{
     @Autowired
    private IExperienciaService expServ; 

    @GetMapping ("/ver/Experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
     return expServ.verExperiencia();
    }
  
}

