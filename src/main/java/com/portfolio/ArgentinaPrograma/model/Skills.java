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

public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String img;

    private String informacion;

    public Skills() {
    }

    public Skills(Long id, String img, String informacion) {
        this.id = id;
        this.img = img;
        this.informacion = informacion;

    }

}
