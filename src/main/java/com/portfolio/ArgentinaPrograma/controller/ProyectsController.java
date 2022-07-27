package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Proyects;
import com.portfolio.ArgentinaPrograma.service.IProyectsService;
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

public class ProyectsController {

    @Autowired
    private IProyectsService proyectsServ;

    @GetMapping("/proyect/list")
    @ResponseBody
    public List<Proyects> get() {
        return proyectsServ.getProyects();
    }

    @PostMapping("/proyect/new")
    public void add(@RequestBody Proyects proyect) {
        proyectsServ.addProyect(proyect);
    }

    @PutMapping("/proyect/update")
    public void update(@RequestBody Proyects proyect) {
        proyectsServ.updateProyect(proyect);
    }

    @DeleteMapping("/proyect/delete/{id}")
    public void delete(@PathVariable Long id) {
        proyectsServ.deleteProyect(id);
    }
}
