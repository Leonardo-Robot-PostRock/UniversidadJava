package src;
//Dentro del paquete útil va importar la clase Scanner para poder utilizarla
import java.util.Scanner;

public class claseScanner {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        //Leer información de la consola
        //System clase de Java
        //In de input
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario = " + usuario);
        System.out.println("Escribe el título: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);

    }
}
