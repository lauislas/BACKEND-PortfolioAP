package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Education;
import java.util.List;

public interface IEducationService {

    public List<Education> getEducations();

    public void addEducation(Education education);

    public void updateEducation(Education education);

    public void deleteEducation(Long id);

    public Education findEducation(Long id);
}
