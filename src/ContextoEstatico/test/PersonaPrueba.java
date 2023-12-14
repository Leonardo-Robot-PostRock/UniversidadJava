package src.ContextoEstatico.test;

import src.ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        //El contexto estático se crea primero que el contexto dinámico y por ello no se puede acceder a this.
        //Por otro lado no se puede acceder a ningun método que no sea estático.
        //Por otro lado un método dinámico si puede acceder a un método estático ya que este ha sido creado.
        Persona persona1 = new Persona("Leonardo");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        System.out.println("persona2 = " + persona2);
    }
}
