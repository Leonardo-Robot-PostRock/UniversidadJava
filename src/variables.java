package src;

public class HolaMundo {
    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Argentina";

        System.out.println(miVariableCadena);

        miVariableCadena = "Mendoza";

        System.out.println(miVariableCadena);

        var miVariableEntera2 = 15;

        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Buenos Aires";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores no permitidos
        //var 1MiVariable = 3;
        //var #miVariable = 2; no se permiten caracteres especiales

        //Valores permitidos
        var $miVariable = 6;
        var _miVariable = 2;
        //var míVariable = 1; No se recomienda utilizar
    }
}
