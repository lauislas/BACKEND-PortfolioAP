package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.About;
import com.portfolio.ArgentinaPrograma.service.IAboutService;
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

@CrossOrigin(origins = "**")
public class AboutController {

    @Autowired
    private IAboutService aboutServ;

    @GetMapping("about/info")
    @ResponseBody
    public List<About> get() {
        return aboutServ.getAbout();
    }
  
    @PostMapping("about/new")
       public void add(@RequestBody About about) {
        aboutServ.addAbout(about); 
    }
    
    @PutMapping("about/update")
    public void update(@RequestBody About about) {
        aboutServ.updateAbout(about);
    }
    
    @DeleteMapping("about/delete/{id}")
    public void delete(@PathVariable Long id) {
        aboutServ.deleteAbout(id);
    }
}
