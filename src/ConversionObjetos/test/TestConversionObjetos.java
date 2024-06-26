package src.ConversionObjetos.test;

import src.ConversionObjetos.domain.Empleado;
import src.ConversionObjetos.domain.Escritor;
import src.ConversionObjetos.domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        //downcasting
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado.obtenerDetalles());
    }
}
