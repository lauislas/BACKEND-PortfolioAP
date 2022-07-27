package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Education;
import com.portfolio.ArgentinaPrograma.service.IEducationService;
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

public class EducationController {
    @Autowired
    private IEducationService educationServ;

   
    @GetMapping("/education/list")
     @ResponseBody
    public List<Education> get() {
        return educationServ.getEducations();
    }
     
    @PostMapping("/education/new")
    public void add(@RequestBody Education education) {
        educationServ.addEducation(education);
    }
   
    @PutMapping("/education/update")
    public void update(@RequestBody Education education) {
        educationServ.updateEducation(education);
    }

    @DeleteMapping("/education/delete/{id}")
    public void delete(@PathVariable Long id) {
        educationServ.deleteEducation(id);
    } 
}