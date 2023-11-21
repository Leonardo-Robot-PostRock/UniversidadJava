package src;

import java.util.Scanner;

public class conversionDeTipos {
    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("(edad + 1) = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
    }
}
