/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.test;

import konstrukto.controller.ObradaOperater;
import konstrukto.controller.ObradaRadnik;
import konstrukto.model.Operater;
import konstrukto.model.Radnik;
import konstrukto.utility.MyException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Isus
 */
public class PocetniInsert {
    
    public static void pocetniinsert() {
        Radnik r = new Radnik();
        r.setIme("Marko");
        r.setPrezime("Herek");
        ObradaRadnik obrada = new ObradaRadnik();
        try {
            r = obrada.spremi(r);
            
        } catch (MyException ex) {
            System.out.println(ex.getPoruka());
        }
        
        Operater o = new Operater();
        o.setIme("Marko");
        o.setPrezime("Herek");
        o.setEmail("Marko@gmail.com");
        o.setSifra(BCrypt.hashpw("m",BCrypt.gensalt()));
        ObradaOperater obradao = new ObradaOperater();
        try {
            o=obradao.spremi(o);
        } catch (MyException ex) {
            System.out.println(ex.getPoruka());
        }
        System.out.println("KRAJ");
   
        
        
        
    }
    
}
