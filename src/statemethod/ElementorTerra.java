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
public class ElementorTerra implements ElementorState{
    @Override
    public ElementorState absorverAgua() {
        System.out.println("Transformando em Elementor Água...");
        return new ElementorAgua();
    }

    @Override
    public ElementorState absorverTerra() {
        System.out.println("Elementor se recuperou...");
        return this;
    }

    @Override
    public ElementorState absorverFogo() {
        System.out.println("Transformando em Elementor Fogo...");
        return new ElementorFogo();
    }

    @Override
    public ElementorState absorverAr() {
        System.out.println("Transformando em Elementor Ar...");
        return new ElementorAr();
    }
}
