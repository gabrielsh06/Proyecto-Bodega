package bodega.vista;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel{
    private ContenedorFrame contenedorFrame;
    private JLabel tituloLabel;
    private JLabel usuarioLabel;
    private JLabel contraseñaLabel;
    private JTextField usuarioField;
    private JPasswordField contraseñaField;
    private JButton iniciarSesionButton;
    private JButton salirButton;

    public LoginPanel(ContenedorFrame contenedorFrame) {
        this.contenedorFrame = contenedorFrame;
        inicializarComponentes();
        configurarEstilos();
        agregarComponentes();
        configurarComponentes();
    }

    private void inicializarComponentes() {
        tituloLabel = new JLabel("Sistema de Gestión de Ventas e Inventario");
        usuarioLabel = new JLabel("Ingresar Usuario");
        contraseñaLabel = new JLabel("Ingresar Contraseña");
        usuarioField = new JTextField();
        contraseñaField = new JPasswordField();
        iniciarSesionButton = new JButton("Iniciar Sesión");
        salirButton = new JButton("Salir");
    }

    private void configurarEstilos() {
        tituloLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        estilosLabel(usuarioLabel);
        estilosLabel(contraseñaLabel);
        estilosField(usuarioField);
        estilosField(contraseñaField);
        estilosBotones(iniciarSesionButton);
        estilosBotones(salirButton);
    }

    private void estilosLabel(JLabel lbl) {
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }

    private void estilosField(JTextField txt) {
        txt.setBorder(BorderFactory.createCompoundBorder(getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }

    private void estilosBotones(JButton btn){
        btn.setPreferredSize(new Dimension(120, 35));
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        btn.setBackground(new Color(49, 100, 147));
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setFocusable(false);
    }

    private void agregarComponentes() {
        setLayout(new GridBagLayout());

        JPanel formInterno = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(20, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formInterno.add(tituloLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        formInterno.add(usuarioLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        formInterno.add(usuarioField, gbc);

        usuarioField.setColumns(15);
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        formInterno.add(contraseñaLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        formInterno.add(contraseñaField, gbc);
        contraseñaField.setColumns(15);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(iniciarSesionButton);
        panelBotones.add(salirButton);
        formInterno.add(panelBotones, gbc);

        add(formInterno, new GridBagConstraints());
    }

    private void configurarComponentes() {
        iniciarSesionButton.addActionListener(e -> {
            contenedorFrame.mostrarPantalla("MENU");
        });
        salirButton.addActionListener(e -> System.exit(0));
    }
}