package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.HSkills;
import java.util.List;

public interface IHSkillsService {

    public List<HSkills> getHSkills();

    public void addHSkill(HSkills hskill);

    public void updateHSkill(HSkills hskill);

    public void deleteHSkill(Long id);

    public HSkills findHSkill(Long id);

}
