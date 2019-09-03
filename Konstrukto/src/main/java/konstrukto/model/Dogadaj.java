/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.util.Date;

/**
 *
 * @author Isus
 */
public class Dogadaj extends Entitet {

    private Date vrijemepocetka;
    private Date vrijemekraja;

    public Dogadaj(Date vrijemepocetka, Date vrijemekraja, Integer id, Integer gradiliste) {
        super(id);
        this.vrijemepocetka = vrijemepocetka;
        this.vrijemekraja = vrijemekraja;
        
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
    
    
    public Dogadaj() {
    }


    
}
