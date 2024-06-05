package src.ManejoArchivos.test;

import static src.ManejoArchivos.manejarArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";

        //crearArchivo(nombreArchivo);

//        escribirArchivo(nombreArchivo, "Hola desde Java");
//        escribirArchivo(nombreArchivo, "Adiós");

//        anexarArchivo(nombreArchivo, "Hola desde Universidad Java");
//        anexarArchivo(nombreArchivo, "Adiós");
        leerArchivo(nombreArchivo);
    }
}
