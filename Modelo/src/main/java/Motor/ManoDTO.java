/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jesus Gammael Soto Escalante 248336
 */
public class ManoDTO {

    private List<CartaDTO> cartasMano;

    public ManoDTO() {
        cartasMano= new LinkedList<>();
    }

    public void agregarCarta(CartaDTO carta) {
        cartasMano.add(carta);
    }

    public void quitar(CartaDTO carta) {
        cartasMano.remove(carta);

    }

    public List<CartaDTO> getCartasMano() {
        return cartasMano;
    }
    
    
}
