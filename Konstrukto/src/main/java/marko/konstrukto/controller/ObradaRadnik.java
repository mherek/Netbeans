/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marko.konstrukto.controller;

import marko.konstrukto.model.Radnik;
import marko.konstrukto.utility.MyException;
import marko.konstrukto.utility.ObradaInterface;

/**
 *
 * @author Isus
 */
public class ObradaRadnik extends Obrada<Radnik> implements ObradaInterface<Radnik> {
    
    public ObradaRadnik(){
        super();
    }

    @Override
    public Radnik create(Radnik entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}