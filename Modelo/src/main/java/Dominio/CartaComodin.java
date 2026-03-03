/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import Dominio.TipoComodin;
import Dominio.Carta;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class CartaComodin extends Carta {
    
    TipoComodin comodin; //

    public CartaComodin(TipoComodin comodin) {
        this.comodin = comodin;
    }

    public CartaComodin() {
    }

    public void setComodin(TipoComodin comodin) {
        this.comodin = comodin;
    }
    
    
    
    public TipoComodin getComodin() {
        return comodin;
    }
    
    
    
    
}
