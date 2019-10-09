/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;

/**
 *
 * @author Isus
 */
public class Operater extends Osoba implements Serializable{
    
    private String sifra;
    private String email;

    public Operater(String sifra, String email, String ime, String prezime, String oib, String iban, Integer id) {
        super(ime, prezime, oib, iban, id);
        this.sifra = sifra;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    public Operater() {
        super();
    }
    
    

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }
    
    
    
}
