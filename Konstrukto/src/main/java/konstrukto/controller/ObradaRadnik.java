/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Radnik;
import konstrukto.utility.MyException;


/**
 *
 * @author Isus
 */
public class ObradaRadnik extends ObradaOsoba<Radnik> {

     @Override
    public List<Radnik> getEntiteti() {
        return session.createQuery("from radnik").list();
    }
    
    public ObradaRadnik() {
        super();
    }

    // Metoda za vracanje iz baze

 @Override
    protected void kontrolaSpremi(Radnik entitet) throws MyException {
        super.kontrolaSpremi(entitet); 
    }


    @Override
    protected void kontrolaBrisi(Radnik entitet) throws MyException{
       kontrolaBrisi(entitet);
}

   
}