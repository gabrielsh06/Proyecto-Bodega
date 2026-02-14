package bodega;

import bodega.database.DatabaseConnection;
import bodega.vista.ContenedorFrame;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    void main() {
        IO.println("¡Hola Mundo!");
        try {
            Connection cn = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,
                    "No se pudo conectar a la base de datos.\n" + "Error: " + e.getMessage(),
                    "Error de Conexión", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        ContenedorFrame contenedorFrame = new ContenedorFrame();
        contenedorFrame.setVisible(true);
    }
}