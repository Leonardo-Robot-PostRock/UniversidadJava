package src.ManejoExcepciones.test;

import static src.ManejoExcepciones.Excepcion.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10,0); //RuntimeException: Uncheck exception -> excepciones que ocurren en tiempo de ejecución.
        } catch (Exception e) {//Se propaga el uso de la excepcion a la clase que hace uso. En este caso la clase main.
            System.out.println("Ocurrió un error:");
            //El IDE recomienda poner System.out como argumento.
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        System.out.println("resultado = " + resultado);
    }

}
