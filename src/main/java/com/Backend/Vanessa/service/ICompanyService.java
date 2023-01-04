
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Company;

import java.util.List;


public interface ICompanyService {
    
    public List<Company> verCompany ();
    public Company crearCompany (Company comp);
    public void borrarCompany (Long id);
    public Company buscarCompany (Long id); 
    
}
