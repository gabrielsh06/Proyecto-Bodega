package bodega;

import bodega.vista.ContenedorFrame;

public class Main {
    void main() {
        IO.println("¡Hola Mundo!");
        ContenedorFrame contenedorFrame = new ContenedorFrame();
        contenedorFrame.setVisible(true);
    }
}