package src.ContextoEstatico.test;

import src.ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        //El contexto estático se crea primero que el contexto dinámico y por ello no se puede acceder a this.
        //Por otro lado no se puede acceder a ningun método que no sea estático.
        //Por otro lado un método dinámico si puede acceder a un método estático ya que este ha sido creado.
        Persona persona1 = new Persona("Leonardo");
        Persona persona2 = new Persona("Karla");

        imprimirStatic(persona1);
        imprimirStatic(persona2);
    }

    //Un método no estático no puede ser referenciado en un contexto estático.
    //Para poder usarlo debería crear un objeto de tipo PersonaPrueba. Esto sucede porque el método está asociado al objeto.
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

    public static void imprimirStatic(Persona persona){
        System.out.println("persona = " + persona);
    }
}
