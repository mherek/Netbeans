/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Isus
 */
public abstract class StrojGradiliste extends Entitet implements Serializable {

    private List<Stroj> strojevi;
    private Gradiliste gradiliste;

    public StrojGradiliste(List<Stroj> strojevi, Gradiliste gradiliste, Integer id) {
        super(id);
        this.strojevi = strojevi;
        this.gradiliste = gradiliste;
    }

    public List<Stroj> getStrojevi() {
        return strojevi;
    }

    public void setStrojevi(List<Stroj> strojevi) {
        this.strojevi = strojevi;
    }

    public Gradiliste getGradiliste() {
        return gradiliste;
    }

    public void setGradiliste(Gradiliste gradiliste) {
        this.gradiliste = gradiliste;
    }

    public StrojGradiliste() {
        super();
    }

}
