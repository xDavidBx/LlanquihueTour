package app;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.ArchivoUtil;
import data.BaseDatos;
import data.ClienteDAO;
import data.TourDAO;

import interfaces.Registrable;

import model.Actividad;
import model.Cliente;
import model.Direccion;
import model.Guia;
import model.Itinerario;
import model.Reserva;
import model.Rut;
import model.Tarjeta;
import model.Tour;

import utils.RutInvalidoException;



public class Main {


    static Scanner teclado = new Scanner(System.in);


    static ClienteDAO clienteDAO =
            new ClienteDAO();


    static TourDAO tourDAO =
            new TourDAO();


    static List<Registrable> registros =
            new ArrayList<>();




    public static void main(String[] args) {



        cargarDatosIniciales();


        int opcion;



        do {


            System.out.println("\n==============================");
            System.out.println("     LLANQUIHUE TOUR");
            System.out.println("==============================");

            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Crear tour");
            System.out.println("4. Mostrar tours");
            System.out.println("5. Crear reserva");
            System.out.println("6. Mostrar reservas");
            System.out.println("7. Mostrar registros polimórficos");
            System.out.println("8. Salir");


            System.out.print("Seleccione opción: ");

            opcion =
                    teclado.nextInt();


            teclado.nextLine();



            switch(opcion){


                case 1:

                    registrarCliente();

                    break;



                case 2:

                    clienteDAO.mostrarClientes();

                    break;



                case 3:

                    crearTour();

                    break;



                case 4:

                    BaseDatos.mostrarTours();

                    break;



                case 5:

                    crearReserva();

                    break;



                case 6:

                    BaseDatos.mostrarReservas();

                    break;



                case 7:

                    mostrarPolimorfismo();

                    break;



                case 8:

                    System.out.println(
                            "Sistema finalizado."
                    );

                    break;



                default:

                    System.out.println(
                            "Opción incorrecta."
                    );


            }



        }while(opcion != 8);



    }


public static void cargarDatosIniciales(){


    try{


        ArchivoUtil.cargarClientes(
                "recursos/clientes.txt"
        );


        ArchivoUtil.cargarTours(
                "recursos/tours.txt"
        );


    }
    catch(Exception e){


        System.out.println(
                "No se cargaron archivos iniciales."
        );


    }


}



    public static void registrarCliente(){



        try{


            System.out.print(
                    "Nombre:"
            );

            String nombre =
                    teclado.nextLine();



            System.out.print(
                    "Rut:"
            );

            Rut rut =
                    new Rut(
                            teclado.nextLine()
                    );



            Direccion direccion =
                    new Direccion(
                            "Centro",
                            "Puerto Montt",
                            "Los Lagos"
                    );



            Tarjeta tarjeta =
                    new Tarjeta(
                            "Banco Chile",
                            "999999"
                    );



            Cliente cliente =
                    new Cliente(
                            nombre,
                            rut,
                            direccion,
                            tarjeta
                    );



            clienteDAO.registrar(cliente);



            registros.add((Registrable) cliente);



        }
        catch(RutInvalidoException e){


            System.out.println(
                    e.getMessage()
            );


        }


    }



    public static void crearTour(){



        Guia guia =
                new Guia();



        guia.setNombre(
                "Guía Pedro"
        );



        Actividad actividad =
                new Actividad(
                        1,
                        "Volcán Osorno",
                        "Excursión turística",
                        "10:00",
                        25000
                );



        Itinerario itinerario =
                new Itinerario(
                        1,
                        "20-07-2026",
                        "22-07-2026"
                );



        itinerario.agregarActividad(
                actividad
        );



        Tour tour =
                new Tour(
                        1,
                        "Ruta Llanquihue",
                        "Tour por la zona",
                        85000,
                        guia,
                        itinerario
                );



        tourDAO.registrar(tour);



        registros.add(tour);



    }




    public static void crearReserva(){



        if(BaseDatos.obtenerClientes().isEmpty()
                ||
                BaseDatos.buscarTour(1)==null){


            System.out.println(
                    "Debe existir cliente y tour."
            );


            return;


        }



        Cliente cliente =
                BaseDatos.obtenerClientes()
                        .get(0);



        Tour tour =
                BaseDatos.buscarTour(1);




        Reserva reserva =
                new Reserva(
                        1,
                        cliente,
                        tour,
                        "18-07-2026",
                        2,
                        "Pendiente"
                );



        BaseDatos.agregarReserva(
                reserva
        );



        registros.add(reserva);



        System.out.println(
                "Reserva creada."
        );



    }


    public static void mostrarPolimorfismo(){



        for(Registrable registro :
                registros){



            if(registro instanceof Cliente){


                System.out.println(
                        "TIPO CLIENTE"
                );


            }


            else if(registro instanceof Tour){


                System.out.println(
                        "TIPO TOUR"
                );


            }


            else if(registro instanceof Reserva){


                System.out.println(
                        "TIPO RESERVA"
                );


            }



            registro.mostrarDatos();



            System.out.println(
                    "-------------------"
            );


        }


    }



}