package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperiences();

    public void addExperience(Experience experience);

    public void updateExperience(Experience experience);

    public void deleteExperience(Long id);

    public Experience findExperience(Long id);
}
