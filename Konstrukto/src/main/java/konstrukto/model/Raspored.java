/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Isus
 */
public class Raspored extends Entitet implements Serializable{
    @ManyToMany
    private List<Radnik> radnici;
    @ManyToOne
    private Gradiliste gradiliste;
    private Date vrijemepocetka;
    private Date vrijemekraja;

    public Raspored() {
        super();
    }

    public Raspored(List<Radnik> radnici, Gradiliste gradiliste, Date vrijemepocetka, Date vrijemekraja, Integer id) {
        super(id);
        this.radnici = radnici;
        this.gradiliste = gradiliste;
        this.vrijemepocetka = vrijemepocetka;
        this.vrijemekraja = vrijemekraja;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
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
