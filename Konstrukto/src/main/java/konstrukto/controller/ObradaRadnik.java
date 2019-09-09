/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.model.Radnik;
import konstrukto.utility.MyException;
import konstrukto.utility.ObradaInterface;

/**
 *
 * @author Isus
 */
public abstract class ObradaRadnik extends Obrada<Radnik> implements ObradaInterface<Radnik> {
    
    public ObradaRadnik(){
        super();
    }

    @Override
    public Radnik create(Radnik entitet) throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Metoda za vracanje iz baze
    public List<Radnik> getRadnik() {
     return session.createQuery("from radnik").list();
    
}
    // 2 nacin
    /*
    public T spremi(T entitet) throws MyException{
     spremi();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        
        return entitet;
     }
*/
}
