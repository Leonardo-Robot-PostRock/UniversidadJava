package src.ContextoEstatico.domain;

public class Persona {
    private int idPersona;
    private String nombre;
    //variable estática asociada con la clase
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        //Recordemos que el contexto dinámico, es decir, el objeto, en este caso el operador this,
        // puede acceder
        //al contexto dinámico, debido a que en este momento ya se cargó la clase en memoria y si entramos al
        //contexto estático de esta clase, podemos observar la variable contador personas en este momento.
        //Esta variable tiene el valor de 1, pero esta variable no se va a reiniciar con cada objeto que creemos,
        //debido a que esta variable se asocia con la clase y no con los objetos.
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
