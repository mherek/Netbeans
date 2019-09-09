/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Isus
 */

// Tablica za provjeru koji dan je koji radnik bio na kojem gradilistu 
 
public class RadnikGradiliste extends Entitet implements Serializable{

    private Date vrijemepocetka;
    private Date vrijemekraja;
    private List<Radnik> radnici;
    private Gradiliste gradiliste;

    public RadnikGradiliste(Date vrijemepocetka, Date vrijemekraja, List<Radnik> radnici, Gradiliste gradiliste, Integer id) {
        super(id);
        this.vrijemepocetka = vrijemepocetka;
        this.vrijemekraja = vrijemekraja;
        this.radnici = radnici;
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
    
    
    public RadnikGradiliste() {
        super();
    }


    
}
