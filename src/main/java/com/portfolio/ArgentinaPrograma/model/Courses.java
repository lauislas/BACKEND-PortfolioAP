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

public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String titulo;

    private String institucion;

    private String inicio;

    private String fin;

    private String img;

    private String urlCredencial;

    public Courses() {
    }

    public Courses(Long id, String titulo, String institucion, String inicio, String fin, String img, String urlCredencial) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
        this.urlCredencial = urlCredencial;
    }
}
