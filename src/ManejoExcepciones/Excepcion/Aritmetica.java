package src.ManejoExcepciones.Excepcion;

public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero");
        }

        return numerador / denominador;
    }

    //A diferencia del método division(...) el compilador no obliga a poner en la firma del método el tipo de Excepcion
    //ya que es de tipo runtime exception.
    public static int divisionV2(int numerador, int denominador) {
        if (denominador == 0) {
            throw new OperacionExceptionRuntimeException("Division entre cero");
        }
        return numerador / denominador;
    }
}
