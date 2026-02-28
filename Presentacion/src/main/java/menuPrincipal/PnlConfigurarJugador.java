package menuPrincipal;

import styles.CustomLabel;
import styles.RoundButton;
import styles.RoundTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlConfigurarJugador extends JPanel {

    FrmPrincipal frame;

    CustomLabel lblTitulo = new CustomLabel("Jugador");
    CustomLabel lblUsuario = new CustomLabel("Nombre de usuario: ");
    RoundTextfield txfdUsuario = new RoundTextfield("Usuario");
    CustomLabel lblColorCartas = new CustomLabel("Color de las cartas");
    CustomLabel lblAvatar = new CustomLabel("Avatar");
    //Botones
        //color de las cartas
    JPanel colorCartas = new JPanel();
    RoundButton btnColor1 = new RoundButton("1");
    RoundButton btnColor2 = new RoundButton("2");
    RoundButton btnColor3 = new RoundButton("3");
    RoundButton btnColor4 = new RoundButton("4");
        //avatar
    JPanel avatar = new JPanel();
    RoundButton btnAvatar1 = new RoundButton(":)");
    RoundButton btnAvatar2 = new RoundButton(":3");
    RoundButton btnAvatar3 = new RoundButton("XD");
    RoundButton btnAvatar4 = new RoundButton(":v");
        //controles
    RoundButton btnAceptar = new RoundButton("Continuar", Color.GREEN);
    RoundButton btnCancelar = new RoundButton("Regresar", Color.RED);

    public PnlConfigurarJugador(FrmPrincipal frame) {

        this.frame = frame;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        colorCartas.add(btnColor1);
        colorCartas.add(btnColor2);
        colorCartas.add(btnColor3);
        colorCartas.add(btnColor4);
        avatar.add(btnAvatar1);
        avatar.add(btnAvatar2);
        avatar.add(btnAvatar3);
        avatar.add(btnAvatar4);

        add(lblTitulo);
        add(lblUsuario);
        add(txfdUsuario);
        add(lblColorCartas);
        add(colorCartas);
        add(lblAvatar);
        add(avatar);
        add(btnAceptar);
        add(btnCancelar);

        btnAceptar.addMouseListener(new MouseAdapter() {
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

    public void continuar() {
        System.out.println("Continuar hacia el lobby");
    }

    public void cancelar() {
        frame.pantallaPrincipal();
    }
}
