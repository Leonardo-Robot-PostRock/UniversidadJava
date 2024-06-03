package src.ManejoExcepciones.test;

import src.ManejoExcepciones.Excepcion.OperacionExceptionRuntimeException;

import static src.ManejoExcepciones.Excepcion.Aritmetica.division;
import static src.ManejoExcepciones.Excepcion.Aritmetica.divisionV2;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;

        try {
            //resultado = division(10,0); //RuntimeException: Uncheck exception -> excepciones que ocurren en tiempo de ejecución.
            resultado = divisionV2(10, 0);
        //Se recomienda procesar las excepciones en orden de menor jerarquía.
        }catch (OperacionExceptionRuntimeException e){
            System.out.println("Ocurrió un error de tipo OperacionExceptionRuntimeException");
            System.out.println(e.getMessage());
        }catch (Exception e) {//Se propaga el uso de la excepcion a la clase que hace uso. En este caso la clase main.
            System.out.println("Ocurrió un error:");
            //El IDE recomienda poner System.out como argumento.
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("resultado = " + resultado);
    }

}
