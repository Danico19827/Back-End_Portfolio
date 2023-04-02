
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IEducacionService {
    public List<Educacion> mostrarEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(int id);
    
    public Educacion buscarEducacion(int id);
}
