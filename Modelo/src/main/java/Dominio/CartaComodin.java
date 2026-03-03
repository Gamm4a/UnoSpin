/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import Dominio.TIpoComodin;
import Dominio.Carta;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class CartaComodin extends Carta {
    
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
