/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class Partida {

    private Mazo mazo;
    private List<Jugador> jugadores;
    private Jugador turnoActual;
    private boolean sentidoHorario;
    private Descarte descarte;
    private Ruleta ruleta;
    private ConfigPartida config;

    public Jugador buscarJugador(long jugadorId) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId() == jugadorId) {
                return jugador;
            }
        }
        return null;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public Descarte getDescarte() {
        return descarte;
    }

    public Jugador getTurnoActual() {
        return turnoActual;
    }

    public Ruleta getRuleta() {
        return ruleta;
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public boolean getSentidoHorario() {
        return sentidoHorario;
    }

    public List<Mano> obtenerTodasLasManos() {
        List<Mano> manos = new LinkedList<>();
        for (Jugador jugador : jugadores) {
            manos.add(jugador.getMano());
        }

        return manos;

    }

    public Carta getUltimaCartaJugada() {
        return descarte.sacarUltimaCarta();
    }

    private int jugadorActual = -1;

    public Jugador getSiguienteJugadorEnTurno() {

        jugadorActual = (jugadorActual + 1) % jugadores.size();
        return jugadores.get(jugadorActual);
    }

    public ConfigPartida getConfig() {
        return config;
    }

    public void setConfig(ConfigPartida config) {
        this.config = config;
    }

    public boolean cambiarTurno() {
        if (sentidoHorario == true) {
            sentidoHorario = false;
            return sentidoHorario;
        } else {
            sentidoHorario = true;
            return sentidoHorario;
        }

    }

}
