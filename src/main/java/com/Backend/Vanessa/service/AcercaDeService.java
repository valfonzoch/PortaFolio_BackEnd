
package com.Backend.Vanessa.service;
import com.Backend.Vanessa.model.AcercaDe;
import com.Backend.Vanessa.repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class AcercaDeService implements IAcercaDeService  {
    
    @Autowired
    public AcercaDeRepository acerRepo; 
    
    @Override
    public AcercaDe crearAcercaDe (AcercaDe acer){
        return acerRepo.save(acer);
    }
    
    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acerRepo.findById(id).orElse(null);
    }

    @Override
    public void editarAcercaDe(AcercaDe acer) {
        acerRepo.save(acer);
    }
     @Override
    public void borrarAcercaDe(Long id) {
        acerRepo.deleteById(id);
    }
   }
    
   
    

