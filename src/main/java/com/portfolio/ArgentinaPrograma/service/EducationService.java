
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Education;
import com.portfolio.ArgentinaPrograma.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
     @Autowired
    private EducationRepository educationRepo;

    @Override
    public List<Education> getEducations() {
        return educationRepo.findAll();
    }

    @Override
    public void addEducation(Education education) {
        educationRepo.save(education);
    }

    @Override
    public void updateEducation(Education education) {
        educationRepo.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        return educationRepo.findById(id).orElse(null);
    }
}
