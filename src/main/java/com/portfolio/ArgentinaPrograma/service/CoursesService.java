package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Courses;
import com.portfolio.ArgentinaPrograma.repository.CoursesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService implements ICoursesService {

    @Autowired
    private CoursesRepository couRepo;

    @Override
    public List<Courses> getCourses() {
        return couRepo.findAll();
    }

    @Override
    public void addCourse(Courses course) {
        couRepo.save(course);
    }

    @Override
    public void updateCourse(Courses course) {
        couRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        couRepo.deleteById(id);
    }

    @Override
    public Courses findCourse(Long id) {
        return couRepo.findById(id).orElse(null);
    }
}
