/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class EstadoJuegoDTO {
    private long idJugadorEnTurno;
    private boolean sentidoHorario;
    private Map<String , Integer> conteoCartasPorJugador;
    private List<CartaDTO> manoJugadorActual;
    private boolean juegoTerminado;
    private String ganador;
    private boolean success;

    public EstadoJuegoDTO() {
    }

    public long getIdJugadorEnTurno() {
        return idJugadorEnTurno;
    }

    public void setIdJugadorEnTurno(long idJugadorEnTurno) {
        this.idJugadorEnTurno = idJugadorEnTurno;
    }

    public boolean isSentidoHorario() {
        return sentidoHorario;
    }

    public void setSentidoHorario(boolean sentidoHorario) {
        this.sentidoHorario = sentidoHorario;
    }

    public Map<String, Integer> getConteoCartasPorJugador() {
        return conteoCartasPorJugador;
    }

    public void setConteoCartasPorJugador(Map<String, Integer> conteoCartasPorJugador) {
        this.conteoCartasPorJugador = conteoCartasPorJugador;
    }

    public List<CartaDTO> getManoJugadorActual() {
        return manoJugadorActual;
    }

    public void setManoJugadorActual(List<CartaDTO> manoJugadorActual) {
        this.manoJugadorActual = manoJugadorActual;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    
    
    
    
    
}
