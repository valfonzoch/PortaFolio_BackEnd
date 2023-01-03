
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Company;

import com.Backend.Vanessa.service.ICompanyService;
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
@RequestMapping("/Company")
public class CompanyController {
    
     @Autowired
    private ICompanyService compServ; 
    
    @PostMapping ("/new/Company")
    public void agregarCompany (@RequestBody Company comp){
       compServ.crearCompany(comp);
       
    }
    
    @GetMapping ("/ver/Company")
    @ResponseBody
    public List<Company> verCompany (){
     return compServ.verCompany();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarCompany (@PathVariable Long id){
          compServ.borrarCompany(id);
        }
}
