package Dominio;


import Dominio.Carta;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class Descarte {
    private List<Carta> cartasDescarte;
    
    public Carta sacarUltimaCarta(){
        return cartasDescarte.getLast();
    }
    
    public void agregarCarta(Carta carta){
        cartasDescarte.add(carta);
    }
    
    
}
