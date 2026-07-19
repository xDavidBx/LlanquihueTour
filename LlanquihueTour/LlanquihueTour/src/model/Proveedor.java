package model;

public class Proveedor extends Persona {

    private String servicio;

    public Proveedor() {
    }

    public Proveedor(String nombre, Rut rut, Direccion direccion, String servicio) {
        super(nombre, rut, direccion);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }


    public void registrar() {
        System.out.println("Proveedor registrado.");
    }

   
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nServicio: " + servicio;
    }
}