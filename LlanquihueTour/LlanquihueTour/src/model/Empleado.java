package model;

public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre, Rut rut, Direccion direccion,
                    String cargo, double sueldo) {

        super(nombre, rut, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Implementación de la interfaz Registrable

    public void registrar() {
        System.out.println("Empleado registrado correctamente.");
    }

    public void mostrarDatos() {
        System.out.println(this);
    }

    // Método sobrecargado

    public void mostrarDatos(boolean mostrarSueldo) {

        if (mostrarSueldo) {
            System.out.println(this);
        } else {
            System.out.println(
                    "Empleado: " + getNombre() +
                    " Cargo: " + cargo
            );
        }
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nCargo: " + cargo +
                "\nSueldo: $" + sueldo;
    }

}