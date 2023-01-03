
package com.Backend.Vanessa.repository;

import com.Backend.Vanessa.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository <College, Long> {
    
}
