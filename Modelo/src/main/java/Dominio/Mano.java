/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class Mano {

    private List<Carta> cartasMano;
    long id;

    public Carta buscarCarta(long cartaId) {
        for (Carta carta : cartasMano) {
            if (carta.getId() == cartaId) {
                return carta;
            }
        }
        return null;

    }

    public void agregarCarta(Carta carta) {
        cartasMano.add(carta);
    }

    public void quitar(Carta carta) {
        cartasMano.remove(carta);

    }

}
