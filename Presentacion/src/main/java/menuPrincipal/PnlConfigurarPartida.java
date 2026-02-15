package menuPrincipal;

import styles.RoundButton;
import styles.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlConfigurarPartida extends JPanel {

    Style style = new Style();

    //Botones
    RoundButton btnContinuar = new RoundButton("Crear partida", Color.yellow);
    RoundButton btnCancelar = new RoundButton("Unirse a partida", Color.yellow);

    public PnlConfigurarPartida() {

        //Establecimiento del panel
        setSize(style.dimensionFrame);
        setBackground(style.colorBase);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Contenido
        add(btnContinuar);
        add(btnCancelar);

        btnContinuar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                continuar();
            }
        });

        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cancelar();
            }
        });

    }

    void continuar() {
        System.out.println("Continuando hacia la configuración del jugador");
    }

    void cancelar() {
        System.out.println("Cancelando; regresando al menú porincipal");
    }

}
