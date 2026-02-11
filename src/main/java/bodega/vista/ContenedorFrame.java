package bodega.vista;

import javax.swing.*;
import java.awt.*;

public class ContenedorFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel contenedor;

    public ContenedorFrame() {
        configurarFrame();
        inicializarComponentes();
    }

    private void configurarFrame() {
        setTitle("SISTEMA DE GESTIÓN DE VENTAS E INVENTARIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        cardLayout = new CardLayout();
        contenedor = new JPanel(cardLayout);

        LoginPanel loginPanel = new LoginPanel(this);

        contenedor.add(loginPanel, "LOGIN");

        add(contenedor);
        cardLayout.show(contenedor, "LOGIN");
    }

    public void mostrarPantalla(String nombrePantalla) {
        cardLayout.show(contenedor, nombrePantalla);
    }
}