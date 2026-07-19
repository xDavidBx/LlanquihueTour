package model;

import java.util.ArrayList;

public class Itinerario {

    private int idItinerario;
    private String fechaInicio;
    private String fechaTermino;
    private ArrayList<Actividad> actividades;


    // Constructor vacío

    public Itinerario() {

        actividades = new ArrayList<>();

    }


    // Constructor con parámetros

    public Itinerario(int idItinerario, String fechaInicio, String fechaTermino) {

        this.idItinerario = idItinerario;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.actividades = new ArrayList<>();

    }


    // Getters y Setters


    public int getIdItinerario() {
        return idItinerario;
    }


    public void setIdItinerario(int idItinerario) {
        this.idItinerario = idItinerario;
    }


    public String getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public String getFechaTermino() {
        return fechaTermino;
    }


    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }


    public ArrayList<Actividad> getActividades() {
        return actividades;
    }


    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }



    // Agregar actividad

    public void agregarActividad(Actividad actividad) {

        actividades.add(actividad);

    }



    // Eliminar actividad

    public void eliminarActividad(int id) {


        Actividad eliminar = null;


        for(Actividad actividad : actividades){


            if(actividad.getIdActividad() == id){

                eliminar = actividad;
                break;

            }

        }


        if(eliminar != null){

            actividades.remove(eliminar);

        }

    }



    // Buscar actividad

    public Actividad buscarActividad(int id){


        for(Actividad actividad : actividades){


            if(actividad.getIdActividad() == id){

                return actividad;

            }

        }


        return null;

    }



    // Mostrar todas las actividades

    public void mostrarActividades(){


        System.out.println("===== ITINERARIO =====");


        for(Actividad actividad : actividades){


            System.out.println(actividad);

            System.out.println("----------------------");


        }


    }



    // Calcular costo total del itinerario

    public double calcularCosto(){


        double total = 0;


        for(Actividad actividad : actividades){


            total += actividad.getCosto();


        }


        return total;

    }



    @Override
    public String toString() {


        return "Itinerario" +
                "\nID: " + idItinerario +
                "\nFecha inicio: " + fechaInicio +
                "\nFecha término: " + fechaTermino +
                "\nCantidad actividades: " + actividades.size() +
                "\nCosto total: $" + calcularCosto();


    }


}