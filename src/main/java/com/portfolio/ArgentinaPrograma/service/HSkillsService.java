package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.HSkills;
import com.portfolio.ArgentinaPrograma.repository.HSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HSkillsService implements IHSkillsService {
    
     @Autowired
    private HSkillsRepository hSkillsRepo;

    @Override
    public List<HSkills> getHSkills() {
        return hSkillsRepo.findAll();
    }

    @Override
    public void addHSkill(HSkills hskill) {
        hSkillsRepo.save(hskill);
    }

    @Override
    public void updateHSkill(HSkills hskill) {
        hSkillsRepo.save(hskill);
    }

    @Override
    public void deleteHSkill(Long id) {
        hSkillsRepo.deleteById(id);
    }

    @Override
    public HSkills findHSkill(Long id) {
        return hSkillsRepo.findById(id).orElse(null);
    }
    
}
