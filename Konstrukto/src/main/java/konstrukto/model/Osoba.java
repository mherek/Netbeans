/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Isus
 */
@MappedSuperclass
public abstract class Osoba extends Entitet {

    private String ime;
    private String prezime;
    private String oib;
    private String iban;

    public Osoba() {
        super();
    }

    public Osoba(String ime, String prezime, String oib, String iban, Integer id) {
        super(id);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
}
