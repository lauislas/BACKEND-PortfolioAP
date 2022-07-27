package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.HSkills;
import com.portfolio.ArgentinaPrograma.service.IHSkillsService;
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

public class HSkillsController {

    @Autowired
    private IHSkillsService hKkillServ;

    @GetMapping("/hSkill/list")
    @ResponseBody
    public List<HSkills> get() {
        return hKkillServ.getHSkills();
    }

    @PostMapping("/hSkill/new")
    public void add(@RequestBody HSkills hSkill) {
        hKkillServ.addHSkill(hSkill);
    }

    @PutMapping("/hSkill/update")
    public void update(@RequestBody HSkills hSkill) {
        hKkillServ.updateHSkill(hSkill);
    }

    @DeleteMapping("/hSkill/delete/{id}")
    public void delete(@PathVariable Long id) {
        hKkillServ.deleteHSkill(id);
    }
}
