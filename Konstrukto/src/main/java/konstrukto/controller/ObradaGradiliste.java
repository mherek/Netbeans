/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Gradiliste;
import konstrukto.utility.MyException;
import konstrukto.utility.ObradaInterface;

/**
 *
 * @author Isus
 */
public class ObradaGradiliste extends Obrada<Gradiliste>  {

    @Override
    public List<Gradiliste> getEntiteti() {
        return session.createQuery("from gradiliste").list();
    }

    @Override
    protected void kontrolaSpremi(Gradiliste entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Gradiliste entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
