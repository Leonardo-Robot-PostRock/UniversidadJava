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

    //RESUMEN

//    El contexto estático hemos dicho que no puede acceder al contexto dinámico debido a que el contexto
//    estático se relaciona con las clases y todavía no hemos creado objetos, así que el contexto estático
//    no puede acceder al contexto dinámico y el contexto dinámico tiene que ver con los objetos y por lo
//    tanto el operador THIS tiene que ver con el contexto dinámico, es decir, cuando ya creamos objetos.
}
