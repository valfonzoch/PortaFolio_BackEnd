
package com.Backend.Vanessa.Controller;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.service.ICertificacionesService;
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
@RequestMapping("/certificaciones")
public class CertificacionesController {
    @Autowired
    private ICertificacionesService cerServ; 
    
    @PostMapping ("/new/Certificacion")
    public void agregarCertificacion (@RequestBody Certificaciones cer){
       cerServ.crearCertificaciones(cer);
    }
    
    @GetMapping ("/ver/Certificaciones")
    @ResponseBody
    public List<Certificaciones> verCertificacion (){
     return cerServ.verCertificaciones();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarCertificaciones (@PathVariable Long id){
          cerServ.borrarCertificaciones(id);
        }
    
}

