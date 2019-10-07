/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Operater;
import konstrukto.utility.MyException;

/**
 *
 * @author Isus
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

   

    @Override
    public List<Operater> getEntiteti() {
          return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaBrisi(Operater entitet) throws MyException {

    }
    
    public Operater getOperater (String email){
           
        return (Operater)session.createQuery("from Operater a "
                + " where a.email=:email ")
                .setParameter("email", email).uniqueResult();
        
        
    }
    }
    
    
    
    
    
    

