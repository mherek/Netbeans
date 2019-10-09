/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.view;

import javax.swing.JFrame;

/**
 *
 * @author Isus
 */
public abstract class KonstruktoView<T> extends JFrame{
    
    protected abstract void ucitaj();
    protected abstract void spremi(T entitet);
    protected abstract boolean kontrola(T entitet);
    protected abstract void postaviVrijednosti(T entitet);
    
}
