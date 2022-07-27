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

public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

     @Basic
    private String institucion;

    private String titulo;

    private String inicio;

    private String fin;

    private String img;

    public Education() {
    }

    public Education(Long id, String institucion, String titulo, String inicio, String fin, String img) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
    }

}
