
package com.portfolio.proyecto.service;

import com.portfolio.proyecto.model.Security;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ISecurityService {
    
    public List<Security> mostrarAuth();
    
    public void crearAuth(Security auth);
    
    public void borrarAuth(int id);
    
    public Security buscarAuth(int id);
    
    
}
