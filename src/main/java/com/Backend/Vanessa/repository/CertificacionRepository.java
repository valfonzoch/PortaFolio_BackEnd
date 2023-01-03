
package com.Backend.Vanessa.repository;

import com.Backend.Vanessa.model.Certificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacionRepository extends JpaRepository <Certificaciones, Long> {
    
}
