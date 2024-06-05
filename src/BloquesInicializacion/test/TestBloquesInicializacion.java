package src.BloquesInicializacion.test;

import src.BloquesInicializacion.domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("\npersona1 = " + persona1);

        Persona personas[] = {new Persona(), new Persona()};

        for (Persona persona : personas) {
            System.out.println("persona = " + persona.getIdPersona());
        }

        //Output:
        //1) Se carga la clase en memoria y se carga el contexto estático, por ello se ejecuta primero el contexto estático.
        //2) Antes de que se ejecute el constructor de la clase. Se ejecuta el bloque no estático.
        //ya que ya se ejecutó el contexto estático, el dinámico ya puede acceder al estático.
        //3) Se ejecuta el constructor de la clase
    }
}
