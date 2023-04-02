
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosRepository extends JpaRepository <Titulos, Long> {
    
}
