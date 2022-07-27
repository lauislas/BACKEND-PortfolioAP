package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.About;
import java.util.List;

public interface IAboutService {

    public List<About> getAbout();

    public void addAbout(About about);

    public void updateAbout(About about);

    public void deleteAbout(Long id);
    
    public About findAbout(Long id);

}
