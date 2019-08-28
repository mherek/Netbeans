/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marko.konstrukto.utility;

/**
 *
 * @author Isus
 */
public class DAO<T> {
   
    public T spremi (T entitet){
        System.out.println("Spremio");
        return entitet;
    }
    
}
