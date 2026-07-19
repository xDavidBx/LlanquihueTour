package model;

import utils.RutInvalidoException;
import utils.ValidadorRut;

public class Rut {

    private String numero;

    public Rut(String numero) throws RutInvalidoException {

        if(!ValidadorRut.validar(numero)){
            throw new RutInvalidoException("RUT inválido");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws RutInvalidoException {

        if(!ValidadorRut.validar(numero)){
            throw new RutInvalidoException("RUT inválido");
        }

        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}