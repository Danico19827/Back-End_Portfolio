
package com.portfolio.proyecto.repository;

import com.portfolio.proyecto.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long> {
    
}