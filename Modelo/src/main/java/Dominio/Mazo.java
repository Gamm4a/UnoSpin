/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Deque;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class Mazo {

    private Deque<Carta> cartasMazo;

    public Carta sacarCarta(){
        return cartasMazo.pop();
    }
    
}
