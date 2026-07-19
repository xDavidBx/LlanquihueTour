package model;

import interfaces.Registrable;

public class Reserva implements Registrable {

    private int idReserva;
    private Cliente cliente;
    private Tour tour;
    private String fechaReserva;
    private int cantidadPersonas;
    private String estado;


    // Constructor vacío

    public Reserva() {
    }



    // Constructor con parámetros

    public Reserva(int idReserva,
                   Cliente cliente,
                   Tour tour,
                   String fechaReserva,
                   int cantidadPersonas,
                   String estado) {


        this.idReserva = idReserva;
        this.cliente = cliente;
        this.tour = tour;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;
        this.estado = estado;

    }



    // Getters y Setters


    public int getIdReserva() {
        return idReserva;
    }


    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Tour getTour() {
        return tour;
    }


    public void setTour(Tour tour) {
        this.tour = tour;
    }


    public String getFechaReserva() {
        return fechaReserva;
    }


    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }


    public int getCantidadPersonas() {
        return cantidadPersonas;
    }


    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }



    // Confirmar reserva

    public void confirmarReserva(){

        this.estado = "Confirmada";

    }



    // Cancelar reserva

    public void cancelarReserva(){

        this.estado = "Cancelada";

    }



    // Calcular costo total

    public double calcularTotal(){


        return tour.getPrecio() * cantidadPersonas;


    }



    // Sobrecarga

    public void mostrarReserva(){

        System.out.println(this);

    }



    public void mostrarReserva(boolean mostrarCliente){


        System.out.println(this);


        if(mostrarCliente){

            System.out.println(
                    "Cliente: " +
                    cliente.getNombre()
            );

        }

    }




    // Implementación Registrable


    @Override
    public void registrar(){

        System.out.println(
                "Reserva creada correctamente."
        );

    }



    @Override
    public void mostrarDatos(){

        System.out.println(this);

    }




    @Override
    public String toString(){


        return "===== RESERVA =====" +
                "\nID Reserva: " + idReserva +
                "\nCliente: " + cliente.getNombre() +
                "\nTour: " + tour.getNombre() +
                "\nFecha: " + fechaReserva +
                "\nCantidad personas: " + cantidadPersonas +
                "\nEstado: " + estado +
                "\nTotal: $" + calcularTotal();


    }


}