package model;

public class Producto {

    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(int codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Sobrecarga

    public void mostrarProducto() {
        System.out.println(this);
    }

    public void mostrarProducto(boolean mostrarDescripcion) {

        if (mostrarDescripcion) {
            System.out.println(this);
        } else {
            System.out.println(nombre + " - $" + precio);
        }

    }

    @Override
    public String toString() {
        return "Producto" +
                "\nCódigo: " + codigo +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nPrecio: $" + precio;
    }

}