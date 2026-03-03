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
public class CartaAccion extends Carta {
    
    TipoAccion tipoAccion;

    public CartaAccion() {
    }

    public CartaAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    
    
    public TipoAccion getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(TipoAccion tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    
    
    
}
