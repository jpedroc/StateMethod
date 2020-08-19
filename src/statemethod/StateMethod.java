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
public class StateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Grupo: Flávio Jr e João Pedro
        Elementor é um personagem do desenho Max Steel, que possuí o poder de absorver elementos básicos da natureza.
        Inicialmente ele é um monstro neutro e assim que absorve um elemento, seu corpo ganha atributos relacioandos ao elemento absorvido.
        Caso Elementor sofra dano e absorva um elemento que já está transformado, sua vida é recuperada.
        */
        Elementor elementor = new Elementor();
        
        elementor.absorverAgua();
        elementor.absorverAgua();
        
        elementor.absorverTerra();
        elementor.absorverTerra();
        
        elementor.absorverAr();
        elementor.absorverAr();
        
        elementor.absorverFogo();
        elementor.absorverFogo();
    }
    
}
