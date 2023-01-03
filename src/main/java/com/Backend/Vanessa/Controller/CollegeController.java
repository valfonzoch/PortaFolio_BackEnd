
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.College;
import com.Backend.Vanessa.service.ICollegeService;

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
@RequestMapping("/College")
public class CollegeController {
    
     @Autowired
    private ICollegeService coleServ; 
    
    @PostMapping ("/new/College")
    public void agregarCollege (@RequestBody College cole){
       coleServ.crearCollege(cole);
    }
    
    @GetMapping ("/ver/College")
    @ResponseBody
    public List<College> verCollege (){
     return coleServ.verCollege();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarCollege (@PathVariable Long id){
          coleServ.borrarCollege(id);
        }
    
    
}
