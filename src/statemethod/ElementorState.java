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
public interface ElementorState {
        
    public ElementorState absorverAgua();
    
    public ElementorState absorverTerra();
    
    public ElementorState absorverFogo();
    
    public ElementorState absorverAr();
    
}
