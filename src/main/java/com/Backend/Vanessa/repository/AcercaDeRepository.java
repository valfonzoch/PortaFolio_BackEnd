
package com.Backend.Vanessa.repository;

import com.Backend.Vanessa.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long> {
    
}
