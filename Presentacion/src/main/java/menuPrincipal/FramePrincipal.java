package menuPrincipal;

import styles.Style;

import javax.swing.*;

public class FramePrincipal extends JFrame {

    Style style = new Style();

    public FramePrincipal( ) {

        //Establecimiento del frame
        setSize(style.dimensionFrame);
        getContentPane().setBackground(style.colorBase);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        PnlPantallaPrincipal pnlPantallaPrincipal = new PnlPantallaPrincipal();
        add(pnlPantallaPrincipal);

        repaint();
        setVisible(true);
    }

}
