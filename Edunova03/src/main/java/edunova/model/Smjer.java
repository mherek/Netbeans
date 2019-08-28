/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class Smjer extends Entitet{
    
    private String naziv;
    private Integer trajanje;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private Boolean certificiran;

    
    public Smjer() {
    }

    public Smjer(Integer sifra, String naziv, Integer trajanje, BigDecimal cijena, BigDecimal upisnina, Boolean certificiran) {
        super(sifra);
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.cijena = cijena;
        this.upisnina = upisnina;
        this.certificiran = certificiran;
    }
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public Boolean isCertificiran() {
        return certificiran;
    }

    public void setCertificiran(Boolean certificiran) {
        this.certificiran = certificiran;
    }

  
    
    
    
    
    
}
