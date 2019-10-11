/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Stroj;
import konstrukto.utility.MyException;

/**
 *
 * @author Isus
 */
public class ObradaStroj extends Obrada<Stroj>{

    @Override
    protected void kontrolaSpremi(Stroj entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Stroj entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Stroj> getEntiteti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
