/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Isus
 */
 @Entity
public class Dogadaj extends Entitet implements Serializable{

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
