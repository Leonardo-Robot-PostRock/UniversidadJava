package src;

import java.util.Scanner;

public class Assigment2DetalleLibro {
    public static void main(String[] args) {

        System.out.println("Ingrese el nombre de autor\n");
        Scanner scanner = new Scanner(System.in);
        var autor = scanner.nextLine();
        System.out.println("Ingrese el nombre del título\n");
        var titulo = scanner.nextLine();

        System.out.println("<"+titulo + "> fue escrito por <"  + autor + ">");

    }
}
