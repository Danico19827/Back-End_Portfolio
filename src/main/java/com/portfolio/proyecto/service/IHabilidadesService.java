
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.model.Habilidades;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IHabilidadesService {
 
    public List<Habilidades> mostrarHabilidades();
    
    public void crearHabilidad(Habilidades habilidad);
    
    public void borrarHabilidad(Long id);
    
    public Habilidades buscarHabilidad(Long id);
    
}
