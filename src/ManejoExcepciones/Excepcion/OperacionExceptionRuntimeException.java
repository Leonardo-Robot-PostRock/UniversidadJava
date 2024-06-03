package src.ManejoExcepciones.Excepcion;

//Es recomendable que las excepciones sean de RuntimeException(uncheck exception).
//De esta manera se mantiene el código más limpio.
//Se debe usar una excepción de tipo check(es decir de tipo Exception), cuando se está seguro que arrojará una excepción.
public class OperacionExceptionRuntimeException extends RuntimeException{
    public OperacionExceptionRuntimeException(String mensaje) {
        super(mensaje);
    }
}
