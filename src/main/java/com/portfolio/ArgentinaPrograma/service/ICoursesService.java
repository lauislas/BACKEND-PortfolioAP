package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Courses;
import java.util.List;

public interface ICoursesService {

    public List<Courses> getCourses();

    public void addCourse(Courses course);

    public void updateCourse(Courses course);

    public void deleteCourse(Long id);

    public Courses findCourse(Long id);
}
