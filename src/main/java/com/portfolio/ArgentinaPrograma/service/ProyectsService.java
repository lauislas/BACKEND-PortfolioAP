
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Proyects;
import com.portfolio.ArgentinaPrograma.repository.ProyectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProyectsService implements IProyectsService {
    
      @Autowired
    private ProyectsRepository proyectsRepo;

    @Override
    public List<Proyects> getProyects() {
         return proyectsRepo.findAll();
    }

    @Override
    public void addProyect(Proyects proyect) {
       proyectsRepo.save(proyect);
    }

    @Override
    public void updateProyect(Proyects proyect) {
        proyectsRepo.save(proyect);
    }

    @Override
    public void deleteProyect(Long id) {
        proyectsRepo.deleteById(id);
    }

    @Override
    public Proyects findProyects(Long id) {
         return proyectsRepo.findById(id).orElse(null);
    }
    
   
    
}
