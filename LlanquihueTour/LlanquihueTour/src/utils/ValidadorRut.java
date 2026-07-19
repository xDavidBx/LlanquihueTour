package utils;

public class ValidadorRut {

    public static boolean validar(String rut){

        return rut.matches("\\d{7,8}-[0-9kK]");
    }

}