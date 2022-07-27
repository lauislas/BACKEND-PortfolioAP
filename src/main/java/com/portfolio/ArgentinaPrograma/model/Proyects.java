package com.portfolio.ArgentinaPrograma.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Proyects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String img;
    private String resumen;
    private String urlProyecto;

    public Proyects() {
    }

    public Proyects(Long id, String img, String resumen, String urlProyecto) {
        this.id = id;
        this.img = img;
        this.resumen = resumen;
        this.urlProyecto=urlProyecto;

    }

}
