
package com.portfolio.ArgentinaPrograma.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Experience {
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        
    private Long id; 

       @Basic
    private String empresa;
    
    private String puesto;
    
    private String inicio;
    
    private String fin;
    
    private String img;
    
    private String resumen;
    
    public Experience() {
    }

    public Experience(Long id, String empresa, String puesto, String inicio, String fin, String img, String resumen) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
        this.resumen = resumen;
    }
    
     
}
