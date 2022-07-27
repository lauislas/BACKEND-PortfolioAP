
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Skills;
import com.portfolio.ArgentinaPrograma.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
   
    @Autowired
    private SkillsRepository skillRepo;

    @Override
    public List<Skills> getSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void addSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void updateSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
}
