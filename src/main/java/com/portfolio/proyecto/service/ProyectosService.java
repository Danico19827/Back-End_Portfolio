
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.model.Proyectos;
import com.portfolio.proyecto.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    public ProyectosRepository proyectoRepo;

    @Override
    public List<Proyectos> mostrarProyectos() {
        List<Proyectos> listaProyectos = proyectoRepo.findAll();
        return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyectos proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
    
}
