package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Skills;
import java.util.List;

public interface ISkillsService {

    public List<Skills> getSkills();

    public void addSkill(Skills skill);

    public void updateSkill(Skills skill);

    public void deleteSkill(Long id);

    public Skills findSkill(Long id);

}
