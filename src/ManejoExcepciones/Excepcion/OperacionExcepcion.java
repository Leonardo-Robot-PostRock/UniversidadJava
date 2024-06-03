package src.ManejoExcepciones.Excepcion;

//Exception de tipo check Exception
public class OperacionExcepcion extends Exception {

    public OperacionExcepcion(String mensaje){
        //se propaga a la clase de excepción.
        super(mensaje);
    }
}
