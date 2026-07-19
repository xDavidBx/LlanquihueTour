package data;

import java.util.ArrayList;

import model.Cliente;

public class ClienteDAO {



    public void registrar(Cliente cliente) {


        BaseDatos.agregarCliente(cliente);


        System.out.println(
                "Cliente guardado correctamente."
        );

    }




    public ArrayList<Cliente> listarClientes() {


        return BaseDatos.obtenerClientes();


    }




    public Cliente buscarCliente(int codigo) {


        return BaseDatos.buscarCliente(codigo);


    }




    public void mostrarClientes() {


        ArrayList<Cliente> clientes =
                listarClientes();



        if(clientes.isEmpty()){


            System.out.println(
                    "No existen clientes registrados."
            );


            return;

        }



        for(Cliente cliente : clientes){


            System.out.println(
                    cliente
            );


            System.out.println(
                    "----------------------"
            );


        }


    }




    public Cliente buscarPorNombre(String nombre){



        for(Cliente cliente :
                BaseDatos.obtenerClientes()){


            if(cliente.getNombre()
                    .equalsIgnoreCase(nombre)){


                return cliente;


            }


        }


        return null;


    }



    public boolean eliminarCliente(Cliente cliente){


        return BaseDatos.obtenerClientes()
                .remove(cliente);


    }


}