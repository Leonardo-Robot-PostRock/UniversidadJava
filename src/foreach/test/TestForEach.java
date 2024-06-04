package src.foreach.test;

import src.matrices.domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8};

        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Leonardo"), new Persona("Angel"), new Persona("Marcelo")};

        //Se puede colocar una clase padre como Object. Pero se recomienda ser específico.
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
