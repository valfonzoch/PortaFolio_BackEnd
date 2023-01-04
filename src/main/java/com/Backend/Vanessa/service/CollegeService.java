
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.College;
import com.Backend.Vanessa.repository.CollegeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService implements ICollegeService {
    
    @Autowired 
    public CollegeRepository coleRepo; 
    
    @Override
    public List<College> verCollege() {
        return coleRepo.findAll();
    }

    @Override
    public College crearCollege(College cole) {
       return coleRepo.save(cole);
    }

    @Override
    public void borrarCollege(Long id) {
       coleRepo.deleteById(id);
    }

    @Override
    public College buscarCollege(Long id) {
        return coleRepo.findById(id).orElse(null);
    }   
}
