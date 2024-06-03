package src.JavaBeans.test;

import src.JavaBeans.domain.*;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Julieta");
        persona.setApellido("Perez");

        System.out.println("persona = " + persona);

        System.out.println("Persona nombre: " + persona.getNombre());
        System.out.println("Persona apellido: " + persona.getApellido());
    }
}
