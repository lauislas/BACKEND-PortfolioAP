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

public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String nombreCompleto;

    private String titulo;

    private String ciudad;

    private String resumen;

    private String img;

    public About() {
    }

    public About(Long id, String nombreCompleto, String titulo, String ciudad, String resumen, String img) {

        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.titulo = titulo;
        this.ciudad = ciudad;
        this.resumen = resumen;
        this.img = img;
    }
}
