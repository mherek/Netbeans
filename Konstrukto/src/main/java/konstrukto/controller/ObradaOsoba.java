/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.controller;

import konstrukto.model.Osoba;
import konstrukto.utility.MyException;

/**
 *
 * @author Isus
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaSpremi(T entitet) throws MyException {
        //kontrola imena, prezimena, email, oib
        kontrolaIme(entitet.getIme());
        kontrolaPrezime(entitet.getPrezime());
        kontrolaOIB(entitet.getOib());
        kontrolaIban(entitet.getIban());
    }

    protected void kontrolaIme(String ime) throws MyException {

        if (ime.trim().length() == 0) {
            throw new MyException(" Ime ne smije biti prazno");
        }
    }

    protected void kontrolaPrezime(String prezime) throws MyException {

        if (prezime.trim().length() == 0) {
            throw new MyException(" Prezime ne smije biti prazno");
        }

    }

    protected void kontrolaIban(String iban) throws MyException {
        if (iban.length() != 21) {
            throw new MyException(" Iban mora imati 21 znak ");
        }
        try {
            Long.parseLong(iban);
        } catch (NumberFormatException e) {
            throw new MyException("Iban ima znak koji nije brojčani");
        }
    }

    protected void kontrolaOIB(String oib) throws MyException {
        if (oib.length() != 11) {
            throw new MyException("OIB mora imati 11 znamenaka");
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            throw new MyException("OIB ima znak koji nije brojčani");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10) {
            kontrolni = 0;
        }

        if (kontrolni != Integer.parseInt(oib.substring(10))) {
            throw new MyException("OIB je neispravan");
        }
    }
}
