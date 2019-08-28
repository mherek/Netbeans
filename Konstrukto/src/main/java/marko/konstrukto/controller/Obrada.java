/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marko.konstrukto.controller;

import marko.konstrukto.utility.DAO;

/**
 *
 * @author Isus
 */
public abstract class Obrada<T> {
    
   
    
    protected DAO<T> dao;

    public Obrada() {
        dao = new DAO<>();
    }
    
    
    
    
}
