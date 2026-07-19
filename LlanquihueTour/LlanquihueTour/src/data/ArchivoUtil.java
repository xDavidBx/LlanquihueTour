package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Direccion;
import model.Rut;
import model.Cliente;
import model.Tarjeta;
import utils.RutInvalidoException;


public class ArchivoUtil {



    public static ArrayList<String> leerArchivo(String ruta) {


        ArrayList<String> datos = new ArrayList<>();


        try {


            BufferedReader lector =
                    new BufferedReader(
                            new FileReader(ruta)
                    );


            String linea;


            while((linea = lector.readLine()) != null){


                datos.add(linea);


            }


            lector.close();



        } catch(IOException e){


            System.out.println(
                    "Error al leer archivo: "
                    + e.getMessage()
            );


        }


        return datos;


    }




    public static void cargarClientes(String ruta){



        ArrayList<String> lineas =
                leerArchivo(ruta);



        for(String linea : lineas){



            try {


                String[] datos =
                        linea.split(",");



                String nombre =
                        datos[0];


                Rut rut =
                        new Rut(datos[1]);


                Direccion direccion =
                        new Direccion(
                                datos[2],
                                datos[3],
                                datos[4]
                        );



                Tarjeta tarjeta =
                        new Tarjeta(
                                datos[5],
                                datos[6]
                        );



                Cliente cliente =
                        new Cliente(
                                nombre,
                                rut,
                                direccion,
                                tarjeta
                        );



                BaseDatos.agregarCliente(cliente);



            } catch(RutInvalidoException e){


                System.out.println(
                        "Cliente no cargado: "
                        + e.getMessage()
                );


            }


        }


    }



    public static void mostrarArchivo(String ruta){


        ArrayList<String> datos =
                leerArchivo(ruta);



        for(String linea : datos){


            System.out.println(linea);


        }


    }

    public static void cargarTours(String recursostourstxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}