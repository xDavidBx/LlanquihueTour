package model;

import java.util.ArrayList;

public class OrdenDeCompra {

    private int numeroOrden;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    // Constructor vacío
    public OrdenDeCompra() {
        productos = new ArrayList<>();
    }

    // Constructor con parámetros
    public OrdenDeCompra(int numeroOrden, Cliente cliente) {
        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Getters y Setters

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    // Agregar producto

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar producto

    public void eliminarProducto(int codigo) {

        Producto eliminar = null;

        for (Producto p : productos) {

            if (p.getCodigo() == codigo) {
                eliminar = p;
                break;
            }

        }

        if (eliminar != null) {
            productos.remove(eliminar);
        }

    }

    // Buscar producto

    public Producto buscarProducto(int codigo) {

        for (Producto p : productos) {

            if (p.getCodigo() == codigo) {
                return p;
            }

        }

        return null;

    }

    // Calcular total

    public double calcularTotal() {

        double total = 0;

        for (Producto p : productos) {

            total += p.getPrecio();

        }

        return total;

    }

    // Mostrar productos

    public void mostrarProductos() {

        System.out.println("----- PRODUCTOS -----");

        for (Producto p : productos) {

            System.out.println(p);
            System.out.println("----------------------");

        }

    }

    @Override
    public String toString() {

        return "Orden de Compra" +
                "\nNúmero: " + numeroOrden +
                "\nCliente: " + cliente.getNombre() +
                "\nCantidad Productos: " + productos.size() +
                "\nTotal: $" + calcularTotal();

    }

}