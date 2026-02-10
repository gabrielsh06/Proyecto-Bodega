package bodega.modelo;

import java.sql.Timestamp;

public class Venta {
    private int idVenta;
    private Timestamp fechaVenta;
    private double total;
    private int idUsuario;

    public Venta(Timestamp fechaVenta, double total, int idUsuario) {
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.idUsuario = idUsuario;
    }

    public Venta(int idVenta, Timestamp fechaVenta, double total, int idUsuario) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.idUsuario = idUsuario;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Timestamp getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Timestamp fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", fechaVenta=" + fechaVenta +
                ", total=" + total +
                ", idUsuario=" + idUsuario +
                '}';
    }
}