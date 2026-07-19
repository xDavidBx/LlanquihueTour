package data;

import java.util.ArrayList;

import model.Tour;

public class TourDAO {


    public void registrar(Tour tour) {


        BaseDatos.agregarTour(tour);


        System.out.println(
                "Tour registrado correctamente."
        );


    }


    public ArrayList<Tour> listarTours() {


        ArrayList<Tour> lista =
                new ArrayList<>();


        for(Tour tour : obtenerTours()){


            lista.add(tour);


        }


        return lista;


    }



    private ArrayList<Tour> obtenerTours(){


        ArrayList<Tour> tours =
                new ArrayList<>();


        return tours;


    }



    public Tour buscarPorId(int id){


        return BaseDatos.buscarTour(id);


    }



    public void mostrarTours(){



        ArrayList<Tour> tours =
                obtenerListaReal();



        if(tours.isEmpty()){


            System.out.println(
                    "No hay tours disponibles."
            );


            return;


        }



        for(Tour tour : tours){


            System.out.println(tour);


            System.out.println(
                    "---------------------"
            );


        }


    }



    public ArrayList<Tour> filtrarPorPrecio(double precioMaximo){


        ArrayList<Tour> resultado =
                new ArrayList<>();


        for(Tour tour : obtenerListaReal()){


            if(tour.getPrecio() <= precioMaximo){


                resultado.add(tour);


            }


        }


        return resultado;


    }



    public boolean eliminarTour(Tour tour){


        return obtenerListaReal()
                .remove(tour);


    }




    private ArrayList<Tour> obtenerListaReal(){


        ArrayList<Tour> lista =
                new ArrayList<>();


        return lista;


    }


}