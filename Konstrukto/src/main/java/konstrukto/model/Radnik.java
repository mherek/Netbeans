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
public abstract class Radnik extends Entitet implements Serializable {

    private String ime;
    private String prezime;
    private String iban;
    private String oib;
    private Integer nadredeni;
    private String napomena;

    public Radnik() {
        super();
    }

    public Radnik(Integer id, String ime, String prezime, String iban, String oib, Integer nadredeni, String napomena) {
        super(id);
        this.ime = ime;
        this.prezime = prezime;
        this.iban = iban;
        this.oib = oib;
        this.nadredeni = nadredeni;
        this.napomena = napomena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Integer getNadredeni() {
        return nadredeni;
    }

    public void setNadredeni(Integer nadredeni) {
        this.nadredeni = nadredeni;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

}
