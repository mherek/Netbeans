/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import java.util.List;
import konstrukto.utility.HibernateUtil;
import konstrukto.utility.MyException;
import org.hibernate.Session;

/**
 *
 * @author Isus
 */
public abstract class Obrada<T> {

    protected abstract void kontrolaSpremi(T entitet) throws MyException;

    protected abstract void kontrolaBrisi(T entitet) throws MyException;

    public abstract List<T> getEntiteti();

    protected Session session;

    public Obrada() {
        this.session = HibernateUtil.getSession();

    }

    public T spremi(T entitet) throws MyException {
        kontrolaSpremi(entitet);
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();

        return entitet;
    }

    public void brisi(T entitet) throws MyException {
        kontrolaBrisi(entitet);
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }

}
