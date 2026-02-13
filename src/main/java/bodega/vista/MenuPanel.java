package bodega.vista;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private ContenedorFrame contenedorFrame;
    private JLabel tituloLabel;
    private JLabel usuarioLabel;
    private JButton ventaButton;
    private JButton productoButton;
    private JButton reporteButton;
    private JButton cerrarSesionButton;

    public MenuPanel(ContenedorFrame contenedorFrame) {
        this.contenedorFrame = contenedorFrame;
        inicializarComponentes();
        configurarEstilos();
        agregarComponentes();
        configurarComponentes();
    }

    private void inicializarComponentes() {
        tituloLabel = new JLabel("SISTEMA DE GESTIÓN DE VENTAS E INVENTARIO");
        usuarioLabel = new JLabel("Gabriel");
        ventaButton = new JButton("Venta");
        productoButton = new JButton("Producto");
        reporteButton = new JButton("Reporte");
        cerrarSesionButton = new JButton("Cerrar Sesión");
    }

    private void configurarEstilos() {
        tituloLabel.setForeground(Color.WHITE);
        usuarioLabel.setForeground(Color.WHITE);

        estilosBotones(ventaButton);
        estilosBotones(productoButton);
        estilosBotones(reporteButton);
        estilosBotones(cerrarSesionButton);
    }

    private void estilosBotones(JButton btn){
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        btn.setBackground(new Color(49, 100, 147));
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 17));
        btn.setFocusable(false);
    }

    private void agregarComponentes() {
        setLayout(new BorderLayout());

        JPanel panelHeader = new JPanel(new BorderLayout());
        panelHeader.setBackground(new Color(33, 37, 41));
        panelHeader.setPreferredSize(new Dimension(0, 40));
        panelHeader.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        panelHeader.add(tituloLabel, BorderLayout.WEST);
        panelHeader.add(usuarioLabel, BorderLayout.EAST);

        JPanel menuLateral = new JPanel(new GridLayout(0, 1, 0, 100));
        menuLateral.setBackground(new Color(225, 230, 230));
        menuLateral.setPreferredSize(new Dimension(250, 0));
        menuLateral.setBorder(BorderFactory.createEmptyBorder(100, 20, 100, 20));
        menuLateral.add(ventaButton);
        menuLateral.add(productoButton);
        menuLateral.add(reporteButton);
        menuLateral.add(cerrarSesionButton);

        add(panelHeader, BorderLayout.NORTH);
        add(menuLateral, BorderLayout.WEST);
    }

    private void configurarComponentes() {

    }
}