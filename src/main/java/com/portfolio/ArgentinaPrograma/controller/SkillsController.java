package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Skills;
import com.portfolio.ArgentinaPrograma.service.ISkillsService;
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

public class SkillsController {

    @Autowired
    private ISkillsService skillServ;

    @GetMapping("/skill/list")
    @ResponseBody
    public List<Skills> get() {
        return skillServ.getSkills();
    }

    @PostMapping("/skill/new")
    public void add(@RequestBody Skills skill) {
        skillServ.addSkill(skill);
    }

    @PutMapping("/skill/update")
    public void update(@RequestBody Skills skill) {
        skillServ.updateSkill(skill);
    }

    @DeleteMapping("/skill/delete/{id}")
    public void delete(@PathVariable Long id) {
        skillServ.deleteSkill(id);
    }

}
