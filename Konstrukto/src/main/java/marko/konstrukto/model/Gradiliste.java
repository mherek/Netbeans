/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marko.konstrukto.model;

/**
 *
 * @author Isus
 */
public class Gradiliste extends Entitet {

    private String ime;
    private String adresa;

    public Gradiliste(String ime, String adresa, Integer id) {
        super(id);
        this.ime = ime;
        this.adresa = adresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
    
    public Gradiliste() {
    }


    
}
