
package com.Backend.Vanessa.service;

import com.Backend.Vanessa.model.Certificaciones;
import com.Backend.Vanessa.repository.CertificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CertificacionesService implements ICertificacionesService {
    
    @Autowired
    public CertificacionRepository certiRepo;

    @Override
    public List<Certificaciones> verCertificaciones() {
        return certiRepo.findAll();
    }

    @Override
    public Certificaciones crearCertificaciones(Certificaciones cer) {
       return certiRepo.save(cer);
    }

    @Override
    public void borrarCertificaciones(Long id) {
        certiRepo.deleteById (id);
    }

    @Override
    public Certificaciones buscarCertificaciones(Long id) {
        return certiRepo.findById(id).orElse(null);
    }
    @Override
    public void editarCertificaciones (Certificaciones cer){
        certiRepo.save(cer);
    }
}
