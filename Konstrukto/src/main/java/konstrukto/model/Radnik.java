/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Isus
 */
@Entity
public class Radnik extends Osoba implements Serializable {

    private String napomena;

    public Radnik() {
        super();
    }

    public Radnik(String napomena, String ime, String prezime, String oib, String iban, Integer id) {
        super(ime, prezime, oib, iban, id);
        this.napomena = napomena;
    }


    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

}
