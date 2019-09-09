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
public abstract class Stroj extends Entitet implements Serializable {

    private String model;
    private String marka;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Stroj(String model, String marka, Integer id) {
        super(id);
        this.model = model;
        this.marka = marka;
    }

    public Stroj() {
        super();
    }

}
