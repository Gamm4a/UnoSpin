/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

import Dominio.Carta;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class CartaDTO {
    private int color;
    private int valor;

    public CartaDTO() {
    }

    public CartaDTO(int color, int valor) {
        this.color = color;
        this.valor = valor;
    }
    
    
    public CartaDTO convertirADTO(Carta carta){
       CartaDTO cartaDTO= new CartaDTO(carta.getColor(), carta.getPuntaje());
       
       
        return cartaDTO;
        
    }
    
    
}
