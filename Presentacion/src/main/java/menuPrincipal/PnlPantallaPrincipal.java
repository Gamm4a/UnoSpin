package menuPrincipal;

import styles.RoundButton;
import styles.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlPantallaPrincipal extends JPanel {

    Style style = new Style();

    //Botones
    RoundButton btnCrearPartida = new RoundButton("Crear partida", Color.yellow);
    RoundButton btnUnirsePartida = new RoundButton("Unirse a partida", Color.yellow);

    public PnlPantallaPrincipal() {

        //Establecimiento del panel
        setSize(style.dimensionFrame);
        setBackground(style.colorBase);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Contenido
        add(btnCrearPartida);
        add(btnUnirsePartida);

        btnCrearPartida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                crearPartida();
            }
        });

        btnUnirsePartida.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                unirsePartida();
            }
        });

    }

    void crearPartida() {
        System.out.println("Crear partida");
    }

    void unirsePartida() {
        System.out.println("Unirse a partida");
    }

}
