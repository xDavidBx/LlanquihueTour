package model;

public class Guia extends Persona {

    private String especialidad;

    public Guia() {
    }

    public Guia(String nombre, Rut rut, Direccion direccion, String especialidad) {
        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void registrar() {
        System.out.println("Guía registrado.");
    }

    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad: " + especialidad;
    }
}