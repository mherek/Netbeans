/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herek.view;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Isus
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(" Ljubavni kalkulator");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOn = new javax.swing.JTextField();
        txtOna = new javax.swing.JTextField();
        lblOn = new javax.swing.JLabel();
        lblOna = new javax.swing.JLabel();
        btnIzracunaj = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblIzracun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtOn.setText("jTextField1");
        txtOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnActionPerformed(evt);
            }
        });

        txtOna.setText("jTextField2");
        txtOna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnaActionPerformed(evt);
            }
        });

        lblOn.setText("On");

        lblOna.setText("Ona");

        btnIzracunaj.setText("Izracunaj");
        btnIzracunaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzracunajActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblIzracun.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(txtOna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblOn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOna)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIzracunaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblIzracun)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOn)
                    .addComponent(lblOna))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnIzracunaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblIzracun)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnActionPerformed
        txtOn.setText("");
    }//GEN-LAST:event_txtOnActionPerformed

    private void txtOnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnaActionPerformed
         txtOna.setText("");
    }//GEN-LAST:event_txtOnaActionPerformed

    private void btnIzracunajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzracunajActionPerformed
        
    }//GEN-LAST:event_btnIzracunajActionPerformed

    private String slozi(){
        String umala = ((txtOn.getText() + txtOna.getText()).toLowerCase());
        char[] mala = umala.toCharArray();
        char c;
        for(int j=1;j<mala.length;j++){
            for(int k=0;k<mala.length - 1;k++){
            if(mala[k] > mala[k + 1]){
                c = mala[k];
                mala[k]=mala[k+1];
                mala[k+1] = c;
            }
            
        }
        }System.out.println(mala);
        return String.valueOf(mala);
        
    }
    
    private void brojac(){
        char c;
        int brojac;
        Map<Character, Integer> mapa = new HashMap<>();
        for(int i=0;i < slozi().length();i++){
            c=slozi().charAt(i);
            if(mapa.containsKey(c)){
                 brojac = mapa.get(c);
                mapa.put(c, ++brojac);
            }else{
                mapa.put(c, 1);
                
                
            }
        }
        TreeMap<Character,Integer> TreeMap = new TreeMap<>();
        TreeMap.putAll(mapa);
        System.out.println(TreeMap);
        Collection<Integer> collection = TreeMap.values();
        Integer [] niz = collection.toArray(new Integer[collection.size()]);
        System.out.println(Arrays.deepToString(niz));
        for(Integer suma : niz){
           if(niz.length%2==0){
               Integer [] suma1p = new Integer[niz.length/2];
               if(suma1p.length %2==0){
                   Integer[] suma2p = 
               } 
           }
        /* if(niz.length%2==0){
             
             }
            Integer [] suma = new Integer [niz.length/2];
            for(suma.length = i;i%2==0){
                Integer [] suma3 = new Integer [niz.length/2];
            }
            if(suma.length%2==0){
                Integer [] suma1 = new Integer [suma.length/2];
                if(suma1.length%2==0){
                    Integer [] suma2 = new Integer[suma1.length/2];
                }
            }*/
        }
        
    }

    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        lblIzracun.setText("");
        lblOna.setText("");
        lblOn.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzracunaj;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblIzracun;
    private javax.swing.JLabel lblOn;
    private javax.swing.JLabel lblOna;
    private javax.swing.JTextField txtOn;
    private javax.swing.JTextField txtOna;
    // End of variables declaration//GEN-END:variables
}
