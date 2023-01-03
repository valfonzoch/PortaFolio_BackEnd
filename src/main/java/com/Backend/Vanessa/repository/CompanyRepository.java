
package com.Backend.Vanessa.repository;

import com.Backend.Vanessa.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository <Company, Long> {
    
}
