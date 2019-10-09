/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Isus
 */
public class RadniNalog extends Entitet implements Serializable {
    @ManyToOne
    private Radnik radnik;
    @OneToOne
    private Gradiliste gradiliste;
    @OneToMany
    private Stroj stroj;

    public RadniNalog() {
        super();
    }

    public RadniNalog(Radnik radnik, Gradiliste gradiliste, Stroj stroj, Integer id) {
        super(id);
        this.radnik = radnik;
        this.gradiliste = gradiliste;
        this.stroj = stroj;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Gradiliste getGradiliste() {
        return gradiliste;
    }

    public void setGradiliste(Gradiliste gradiliste) {
        this.gradiliste = gradiliste;
    }

    public Stroj getStroj() {
        return stroj;
    }

    public void setStroj(Stroj stroj) {
        this.stroj = stroj;
    }
    
    
    
    
    
}
