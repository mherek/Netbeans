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
public abstract class RadnikStroj extends Entitet implements Serializable{
    
    private List<Radnik> radnici;
    private List<Stroj> strojevi;
    private Date datumkoristenja;

    public RadnikStroj() {
    super();
    }

    public RadnikStroj(List<Radnik> radnici, List<Stroj> strojevi, Date datumkoristenja, Integer id) {
        super(id);
        this.radnici = radnici;
        this.strojevi = strojevi;
        this.datumkoristenja = datumkoristenja;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }

    public List<Stroj> getStrojevi() {
        return strojevi;
    }

    public void setStrojevi(List<Stroj> strojevi) {
        this.strojevi = strojevi;
    }

    public Date getDatumkoristenja() {
        return datumkoristenja;
    }

    public void setDatumkoristenja(Date datumkoristenja) {
        this.datumkoristenja = datumkoristenja;
    }
    
    
    
}
