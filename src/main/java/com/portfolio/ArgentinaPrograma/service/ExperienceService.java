
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Experience;
import com.portfolio.ArgentinaPrograma.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {
 
    @Autowired
    private ExperienceRepository experienceRepo;
    
    
     @Override
    public List<Experience> getExperiences() {
        return experienceRepo.findAll();
    }

    @Override
    public void addExperience(Experience experience) {
        experienceRepo.save(experience);
    }

    @Override
    public void updateExperience(Experience experience) {
        experienceRepo.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        return experienceRepo.findById(id).orElse(null);
    }
}
