
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Certificaciones;
import java.util.List;


public interface ICertificacionesService {
   public List<Certificaciones> verCertificaciones ();
    public Certificaciones crearCertificaciones (Certificaciones certi);
    public void borrarCertificaciones (Long id);
    public Certificaciones buscarCertificaciones (Long id);  
}
