/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

import Dominio.Partida;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class UnoSpinMotor implements IMotorFacade {

    private Partida partida;
    private ManejadorEfectos manejadorEfectos;

    @Override
    public EstadoJuegoDTO tirarCarta(long jugadorId, long cartaId) {
        
    }

    @Override
    public EstadoJuegoDTO robarCarta(long jugadorId) {
    }

    @Override
    public EstadoJuegoDTO girarRuleta(long jugadorId) {
    }

    @Override
    public EstadoJuegoDTO obtenerEstadoActual() {
    }

    @Override
    public EstadoJuegoDTO gritarUno(long jugadorId) {
    }

    @Override
    public void IniciarPartida() {
    }

    @Override
    public EstadoJuegoDTO mandarTomaDos(long id) {
    }

    private boolean esTurnoValid(int jugadorId) {
        
    }

    private boolean esCartaJugable(CartaDTO Jugada, CartaDTO Ultima) {

    }

    public boolean tieneManoRobable(JugadorDTO jugador, CartaDTO ultima) {

    }

    public void registrarJugador(String alias, String avatar, ColoresUsuariosDTO colores) {

    }

    private void siguienteTurno() {

    }

    private CartaDTO getUltimaCartaJugada() {

    }

}
