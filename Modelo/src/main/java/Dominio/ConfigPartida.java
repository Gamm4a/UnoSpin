/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
class ConfigPartida {
    private final int rangoNumerosMin;
    private final int rangoNumerosMax;
    private final int cantidadComodines;
    private final int cantidadAccion;
    private final int tiempoMostrarCartas;

    public ConfigPartida(int rangoNumerosMin, int rangoNumerosMax, int cantidadComodines, int cantidadAccion, int tiempoMostrarCartas) {
        this.rangoNumerosMin = rangoNumerosMin;
        this.rangoNumerosMax = rangoNumerosMax;
        this.cantidadComodines = cantidadComodines;
        this.cantidadAccion = cantidadAccion;
        this.tiempoMostrarCartas = tiempoMostrarCartas;
    }

    public int getRangoNumerosMin() {
        return rangoNumerosMin;
    }

    public int getRangoNumerosMax() {
        return rangoNumerosMax;
    }

    public int getCantidadComodines() {
        return cantidadComodines;
    }

    public int getCantidadAccion() {
        return cantidadAccion;
    }

    public int getTiempoMostrarCartas() {
        return tiempoMostrarCartas;
    }
    
    
    
    
}
