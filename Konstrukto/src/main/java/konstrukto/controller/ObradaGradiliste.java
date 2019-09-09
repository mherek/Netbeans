/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Gradiliste;
import konstrukto.utility.ObradaInterface;

/**
 *
 * @author Isus
 */
public abstract class ObradaGradiliste extends Obrada<Gradiliste> implements ObradaInterface<Gradiliste> {
    
    public List<Gradiliste> getGradiliste(){
      return session.createQuery("from gradiliste").list();
}
    
}
