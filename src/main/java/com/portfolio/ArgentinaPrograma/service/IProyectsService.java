
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Proyects;
import java.util.List;


public interface IProyectsService {
    
     public List<Proyects> getProyects();

    public void addProyect(Proyects proyect);

    public void updateProyect(Proyects proyect);

    public void deleteProyect(Long id);

    public Proyects findProyects(Long id);
}
