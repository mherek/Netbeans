/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.utility;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Isus
 */
public class HibernateUtil {

    private static Session session;

    //zabranimo konstruiranje klase
    protected HibernateUtil() {

    }

    public static Session getSession() {
        if (session == null) {
            try {
                session = new Configuration()
                        .configure()
                        .buildSessionFactory()
                        .openSession();

            } catch (Throwable e) {
                //ovdeje će završiti ako imamo problema s hibernate.cfg.xml
                throw new ExceptionInInitializerError(e);
            }
        }

        return session;
    }

}


