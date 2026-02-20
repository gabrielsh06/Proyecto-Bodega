package bodega.modelo;

import java.sql.Date;

public class Producto {
    private int idProducto;
    private String nombre;
    private String codigoBarra;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private int stockMinimo;
    private Date fechaVencimiento;
    private String categoria;
    private boolean activo;
    private Integer idProveedor;

    public Producto(String nombre, String codigoBarra, double precioCompra, double precioVenta, int stock,
                    int stockMinimo, Date fechaVencimiento, String categoria, Integer idProveedor, boolean activo) {
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.fechaVencimiento = fechaVencimiento;
        this.categoria = categoria;
        this.activo = activo;
        this.idProveedor = idProveedor;
    }

    public Producto(int idProducto, String nombre, String codigoBarra, double precioCompra, double precioVenta,
                    int stock, int stockMinimo, Date fechaVencimiento, String categoria, Integer idProveedor, boolean activo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.fechaVencimiento = fechaVencimiento;
        this.categoria = categoria;
        this.activo = activo;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", códigoBarra='" + codigoBarra + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                ", stockMínimo=" + stockMinimo +
                ", fechaVencimiento=" + fechaVencimiento +
                ", categoria='" + categoria + '\'' +
                ", activo='" + activo + '\'' +
                ", idProveedor=" + idProveedor +
                '}';
    }
}