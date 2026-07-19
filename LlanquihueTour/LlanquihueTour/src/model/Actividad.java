package model;

public class Actividad {

    private int idActividad;
    private String nombre;
    private String descripcion;
    private String horario;
    private double costo;

    // Constructor vacío
    public Actividad() {
    }

    // Constructor con parámetros
    public Actividad(int idActividad, String nombre, String descripcion,
                     String horario, double costo) {

        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.costo = costo;
    }


    // Getters y Setters

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
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


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    // Método para mostrar información

    public void mostrarActividad() {

        System.out.println(this);

    }


    // Sobrecarga

    public void mostrarActividad(boolean mostrarCosto) {

        if (mostrarCosto) {

            System.out.println(this);

        } else {

            System.out.println(
                    "Actividad: " + nombre +
                    "\nHorario: " + horario
            );

        }

    }


    @Override
    public String toString() {

        return "Actividad" +
                "\nID: " + idActividad +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nHorario: " + horario +
                "\nCosto: $" + costo;

    }

}