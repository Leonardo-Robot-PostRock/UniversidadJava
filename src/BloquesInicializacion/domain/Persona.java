package src.BloquesInicializacion.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque estático
    //Se va a ejecutar cuando se cargue por primera vez esta clase en Memoria.(se ejecuta 1 vez)
    static {
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; Contexto estático no puede acceder a contexto dinámico.
    }

    //Se ejecuta antes del constructor de la clase.
    //Bloque NO estático o contexto dinámico. Se ejecuta cada vez que se instancia un objeto de esta clase.
    //La variable contador ya va estar incrementada gracias al bloque estático. Es decir comenzará en 1.
    {
        System.out.println("Ejecución bloque No estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
