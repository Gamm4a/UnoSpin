/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
 class Jugador {
    
    private String alias;
    private String avatar;
    private ColoresUsuarios colorCartas;
    private float puntuacion;
    private Mano mano;
    private long id;

    public Jugador(String alias, String avatar, ColoresUsuarios colorCartas, float puntuacion, Mano mano, long id) {
        this.alias = alias;
        this.avatar = avatar;
        this.colorCartas = colorCartas;
        this.puntuacion = puntuacion;
        this.mano = mano;
        this.id = id;
    }

    public Jugador() {
    }
    
    
    
    public Mano getMano() {
        return mano;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ColoresUsuarios getColorCartas() {
        return colorCartas;
    }

    public void setColorCartas(ColoresUsuarios colorCartas) {
        this.colorCartas = colorCartas;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
    
}
