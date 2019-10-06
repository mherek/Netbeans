/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.util.Date;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Isus
 */
public class RadnikGradiliste extends Entitet {
    @OneToMany
    private Radnik radnik;
    @ManyToMany
    private Gradiliste gradiliste;
    private Date vrijemepocetka;
    private Date vrijemekraja;

    public RadnikGradiliste() {
        super();
    }

    public RadnikGradiliste(Radnik radnik, Gradiliste gradiliste, Date vrijemepocetka, Date vrijemekraja, Integer id) {
        super(id);
        this.radnik = radnik;
        this.gradiliste = gradiliste;
        this.vrijemepocetka = vrijemepocetka;
        this.vrijemekraja = vrijemekraja;
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

    public Date getVrijemepocetka() {
        return vrijemepocetka;
    }

    public void setVrijemepocetka(Date vrijemepocetka) {
        this.vrijemepocetka = vrijemepocetka;
    }

    public Date getVrijemekraja() {
        return vrijemekraja;
    }

    public void setVrijemekraja(Date vrijemekraja) {
        this.vrijemekraja = vrijemekraja;
    }
    
    
    
    
}
