/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Motor;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public interface IMotorFacade {
    
    EstadoJuegoDTO tirarCarta(long jugadorId, long cartaId);
    EstadoJuegoDTO robarCarta(long jugadorId);
    EstadoJuegoDTO girarRuleta(long jugadorId);
    EstadoJuegoDTO obtenerEstadoActual();
    EstadoJuegoDTO gritarUno(long jugadorId);
    void IniciarPartida();
    EstadoJuegoDTO mandarTomaDos(long id);
    
    
}
