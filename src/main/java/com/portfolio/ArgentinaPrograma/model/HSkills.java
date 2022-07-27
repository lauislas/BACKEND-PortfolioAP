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
public class HSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String conocimiento;
    private Integer porcentaje;

    
    public HSkills() {
    }

    public HSkills(Long id, String conocimiento, Integer porcentaje) {
        this.id = id;
        this.conocimiento = conocimiento;
        this.porcentaje = porcentaje;

    }

}
