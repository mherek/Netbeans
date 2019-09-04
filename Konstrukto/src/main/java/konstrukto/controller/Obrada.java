/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import konstrukto.utility.DAO;
import konstrukto.utility.HibernateUtil;
import konstrukto.utility.MyException;
import org.hibernate.Session;

/**
 *
 * @author Isus
 */
public abstract class Obrada<T> {
    
   
   protected abstract void spremi() throws MyException;
   protected abstract void brisi() throws MyException;
   protected abstract void citaj() throws MyException;
   
   protected Session session;
   
   public Obrada(){
       this.session=HibernateUtil.getSession();
       
   }
        
   
     public T spremi(T entitet) throws MyException{
     spremi();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        
        return entitet;
     }
    
     public void brisi (T entitet) throws MyException{
         brisi();
         session.beginTransaction();
         session.delete(entitet);
         session.getTransaction().commit();     }
     
     public void citaj (T entitet ) throws MyException{
         session.beginTransaction();
         session.get(entitet, );
         
     }
}

