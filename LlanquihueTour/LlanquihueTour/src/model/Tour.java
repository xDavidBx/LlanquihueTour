package model;

import interfaces.Registrable;

public class Tour implements Registrable {

    private int idTour;
    private String nombre;
    private String descripcion;
    private double precio;

    private Guia guia;
    private Itinerario itinerario;


    // Constructor vacío

    public Tour() {
    }


    // Constructor con parámetros

    public Tour(int idTour, String nombre, String descripcion,
                double precio, Guia guia, Itinerario itinerario) {

        this.idTour = idTour;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.guia = guia;
        this.itinerario = itinerario;

    }



    // Getters y Setters


    public int getIdTour() {
        return idTour;
    }


    public void setIdTour(int idTour) {
        this.idTour = idTour;
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


    public Guia getGuia() {
        return guia;
    }


    public void setGuia(Guia guia) {
        this.guia = guia;
    }


    public Itinerario getItinerario() {
        return itinerario;
    }


    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }



    // Método para modificar precio

    public void actualizarPrecio(double nuevoPrecio){

        this.precio = nuevoPrecio;

    }



    // Sobrecarga

    public void mostrarTour(){

        System.out.println(this);

    }



    public void mostrarTour(boolean mostrarItinerario){


        System.out.println(this);


        if(mostrarItinerario){

            itinerario.mostrarActividades();

        }


    }



    // Implementación interfaz Registrable


    @Override
    public void registrar(){

        System.out.println(
                "Tour registrado correctamente."
        );

    }



    @Override
    public void mostrarDatos(){

        System.out.println(this);

    }



    @Override
    public String toString(){


        return "===== TOUR =====" +
                "\nID: " + idTour +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nPrecio: $" + precio +
                "\nGuía responsable: " + guia.getNombre() +
                "\nItinerario: " + itinerario.getIdItinerario();


    }


}