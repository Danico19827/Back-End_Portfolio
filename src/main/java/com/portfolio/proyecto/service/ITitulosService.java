
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.model.Titulos;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ITitulosService {
    public List<Titulos> mostrarTitulos();
    
    public void crearTitulo(Titulos titulo);
    
    public void borrarTitulo(Long id);
    
    public Titulos buscarTitulo(Long id);
}
