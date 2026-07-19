package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import model.Cliente;
import model.Producto;
import model.Reserva;
import model.Tour;

public class BaseDatos {


    // Colecciones principales del sistema

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    private static ArrayList<Tour> tours = new ArrayList<>();

    private static ArrayList<Reserva> reservas = new ArrayList<>();

    private static ArrayList<Producto> productos = new ArrayList<>();



    // HashMap para búsquedas rápidas

    private static HashMap<Integer, Cliente> mapaClientes = new HashMap<>();

    private static HashMap<Integer, Tour> mapaTours = new HashMap<>();



    // Stack para historial de reservas

    private static Stack<Reserva> historialReservas = new Stack<>();




    // =========================
    // CLIENTES
    // =========================


    public static void agregarCliente(Cliente cliente){


        clientes.add(cliente);

        mapaClientes.put(
                cliente.getRut().hashCode(),
                cliente
        );


    }



    public static ArrayList<Cliente> obtenerClientes(){

        return clientes;

    }



    public static Cliente buscarCliente(int codigo){


        return mapaClientes.get(codigo);


    }



    public static void mostrarClientes(){


        System.out.println(
                "===== CLIENTES REGISTRADOS ====="
        );


        for(Cliente cliente : clientes){

            System.out.println(cliente);

            System.out.println("--------------------");

        }


    }





    // =========================
    // TOURS
    // =========================


    public static void agregarTour(Tour tour){


        tours.add(tour);


        mapaTours.put(
                tour.getIdTour(),
                tour
        );


    }



    public static Tour buscarTour(int id){


        return mapaTours.get(id);


    }




    public static void mostrarTours(){


        System.out.println(
                "===== TOURS DISPONIBLES ====="
        );


        for(Tour tour : tours){


            System.out.println(tour);

            System.out.println("--------------------");


        }


    }





    // =========================
    // RESERVAS
    // =========================


    public static void agregarReserva(Reserva reserva){


        reservas.add(reserva);


        historialReservas.push(reserva);


    }



    public static ArrayList<Reserva> obtenerReservas(){


        return reservas;


    }



    public static void mostrarReservas(){


        System.out.println(
                "===== RESERVAS ====="
        );


        for(Reserva reserva : reservas){


            System.out.println(reserva);

            System.out.println("--------------------");


        }


    }



    // Última reserva realizada

    public static Reserva ultimaReserva(){


        if(!historialReservas.empty()){

            return historialReservas.peek();

        }


        return null;

    }





    // =========================
    // PRODUCTOS
    // =========================



    public static void agregarProducto(Producto producto){


        productos.add(producto);


    }



    public static void mostrarProductos(){


        for(Producto producto : productos){


            System.out.println(producto);

            System.out.println("--------------------");


        }


    }



}