package model;

public class Cliente extends Persona {

    private Tarjeta tarjeta;

    public Cliente() {
    }

    public Cliente(String nombre, Rut rut, Direccion direccion, Tarjeta tarjeta) {
        super(nombre, rut, direccion);
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }


    public void registrar() {
        System.out.println("Cliente registrado.");
    }


    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTarjeta: " + tarjeta;
    }
}