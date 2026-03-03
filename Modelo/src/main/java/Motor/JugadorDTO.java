/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class JugadorDTO {
    
    private String alias;
    private String avatar;
    private ColoresUsuariosDTO colorCartas;
    private float puntuacion;
    private ManoDTO mano;
    private long id;

    public JugadorDTO(String alias, String avatar, ColoresUsuariosDTO colorCartas, float puntuacion, ManoDTO mano, long id) {
        this.alias = alias;
        this.avatar = avatar;
        this.colorCartas = colorCartas;
        this.puntuacion = puntuacion;
        this.mano = mano;
        this.id = id;
    }

    public JugadorDTO() {
    }
    
    
    
    public ManoDTO getMano() {
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

    public ColoresUsuariosDTO getColorCartas() {
        return colorCartas;
    }

    public void setColorCartas(ColoresUsuariosDTO colorCartas) {
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
