/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemethod;

/**
 *
 * @author jpedroc
 */
public class Elementor {
    
    protected ElementorState estado;
    
    public Elementor(){
        estado = new ElementorNeutro();
    } 
    
    public void absorverAgua(){
        estado = estado.absorverAgua();
    }
    
    public void absorverFogo(){
        estado = estado.absorverFogo();
    }
    
    public void absorverTerra(){
        estado = estado.absorverTerra();
    }
    
    public void absorverAr(){
        estado = estado.absorverAr();
    }
    
}
