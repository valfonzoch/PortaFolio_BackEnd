
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.College;
import java.util.List;


public interface ICollegeService {
    
    public List<College> verCollege ();
    public College crearCollege (College cole);
    public void borrarCollege (Long id);
    public College buscarCollege (Long id); 
    
    
}






   