
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Company;

import com.Backend.Vanessa.repository.CompanyRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyService implements ICompanyService {
    
    @Autowired
    public CompanyRepository comRepo;
   

    @Override
    public List<Company> verCompany() {
        return comRepo.findAll();
    }

    @Override
    public  Company crearCompany(Company comp) {
       return comRepo.save(comp);  
    }

    @Override
    public void borrarCompany(Long id) {
        comRepo.deleteById(id);
    }

    @Override
    public Company buscarCompany(Long id) {
        return comRepo.findById(id).orElse(null);
    }

}