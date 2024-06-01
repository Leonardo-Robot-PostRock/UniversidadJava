package src;

import java.util.Scanner;

public class Assigment3TiendaDeLibros {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        var nombre = consola.nextLine();
        System.out.println("Ingrese el id");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el precio");
        var precio = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el envío gratuito");
        var envio = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);
    }
}
