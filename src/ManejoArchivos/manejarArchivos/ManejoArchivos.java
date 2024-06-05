package src.ManejoArchivos.manejarArchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        //La clase PrintWriter hereda de la clase Exception(Check exception). Por ello obliga a reportar la
        //Excepción en la firma del método o atraparla en un try catch.

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        //La clase PrintWriter hereda de la clase Exception(Check exception). Por ello obliga a reportar la
        //Excepción en la firma del método o atraparla en un try catch.

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        //La clase PrintWriter hereda de la clase Exception(Check exception). Por ello obliga a reportar la
        //Excepción en la firma del método o atraparla en un try catch.

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado información al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            //FileReader no lee líneas completas por ello se la envuelve con BufferedReader.
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();

            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
