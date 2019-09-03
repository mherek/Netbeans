/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstrukto.model;

/**
 *
 * @author Isus
 */
 public abstract class Entitet {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
   
        private Integer id;
        
        public Entitet(){
            
        }

        public Entitet(Integer id) {
            this.id = id;
        }
        
    }
    

