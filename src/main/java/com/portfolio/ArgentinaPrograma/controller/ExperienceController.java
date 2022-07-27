package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Experience;
import com.portfolio.ArgentinaPrograma.service.IExperienceService;
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

public class ExperienceController {

    @Autowired
    private IExperienceService experienceServ;

    @GetMapping("/experience/list")
    @ResponseBody
    public List<Experience> get() {
        return experienceServ.getExperiences();
    }

    @PostMapping("/experience/new")
    public void add(@RequestBody Experience experience) {
        experienceServ.addExperience(experience);
    }

    @PutMapping("/experience/update")
    public void update(@RequestBody Experience experience) {
        experienceServ.updateExperience(experience);
    }

    @DeleteMapping("/experience/delete/{id}")
    public void delete(@PathVariable Long id) {
        experienceServ.deleteExperience(id);
    }
}
