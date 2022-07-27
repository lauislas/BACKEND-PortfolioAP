package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.About;
import com.portfolio.ArgentinaPrograma.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {

    @Autowired
    private AboutRepository aboutRepo;

    @Override
    public List<About> getAbout() {
        return aboutRepo.findAll();
    }

    @Override
    public void addAbout(About about) {
        aboutRepo.save(about);
    }

    @Override
    public void updateAbout(About about) {
        aboutRepo.save(about);
    }

    @Override
    public void deleteAbout(Long id) {
        aboutRepo.deleteById(id);
    }
    
     @Override
    public About findAbout(Long id) {
        return aboutRepo.findById(id).orElse(null);
    }

}
