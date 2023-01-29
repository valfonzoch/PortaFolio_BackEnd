
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.AcercaDe;


public interface IAcercaDeService {
    
    public AcercaDe crearAcercaDe (AcercaDe acer);
    public void borrarAcercaDe (Long id);
    public AcercaDe buscarAcercaDe (Long id); 
    public void editarAcercaDe (AcercaDe acer); 
    
}
