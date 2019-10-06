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

    public Operater(String sifra, String ime, String prezime, String oib, String iban, Integer id) {
        super(ime, prezime, oib, iban, id);
        this.sifra = sifra;
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
