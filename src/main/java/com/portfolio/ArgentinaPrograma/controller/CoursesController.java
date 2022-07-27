package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Courses;
import com.portfolio.ArgentinaPrograma.service.ICoursesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CoursesController {

    @Autowired
    private ICoursesService courseServ;

    
    @GetMapping("/course/list")
    @ResponseBody
    public List<Courses> get() {
        return courseServ.getCourses();
    }
   
    @PostMapping("/course/new")
    public void add(@RequestBody Courses course) {
        courseServ.addCourse(course);
    }
   
    @PutMapping("/course/update")
    public void update(@RequestBody Courses course) {
        courseServ.updateCourse(course);
    }
   
    @DeleteMapping("/course/delete/{id}")
    public void delete(@PathVariable Long id) {
        courseServ.deleteCourse(id);
    }
}
