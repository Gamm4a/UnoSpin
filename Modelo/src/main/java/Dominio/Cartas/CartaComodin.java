/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Cartas;

import Dominio.Carta;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class CartaComodin extends Carta {
    
    TIpoComodin comodin; //

    public CartaComodin(TIpoComodin comodin) {
        this.comodin = comodin;
    }

    public CartaComodin() {
    }

    public void setComodin(TIpoComodin comodin) {
        this.comodin = comodin;
    }
    
    
    
    public TIpoComodin getComodin() {
        return comodin;
    }
    
    
    
    
}
