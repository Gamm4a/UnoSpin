/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controller;

import Dominio.Descarte;
import Modelos.Descarte;
import Modelos.Jugador;
import Modelos.Partida;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class Controller {

    Partida partidaModel;
    Jugador jugadorModel;
    Descarte descarteModel;

    public Controller() {
        partidaModel = new Partida();
        jugadorModel = new Jugador();
        descarteModel = new Descarte();
    }

    //necesita recibir una carta y entregar una carta al modelo
    public void validarCartaJugable(CartaDTO carta) {
        partidaModel.validarCartaJugable();
    }

    //necesita recibir una carta y entregar una carta al modelo
    public void solicitarValidacion(CartaDTO carta) {
        partidaModel.solicitarValidacion();
    }

    //necesita recibir una carta y entregar una carta al modelo
    public void quitarCartaDeMano(CartaDTO carta) {
        jugadorModel.quitarCartaMano();
    }

    public void agregarCartaEnDescarte() {
        descarteModel.agregarCarta();
    }

}
