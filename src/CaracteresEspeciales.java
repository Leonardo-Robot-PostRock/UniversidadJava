package src;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        //o
        System.out.println("Comilla simple: '" + nombre + "'");
        //o
        System.out.println("Comilla simple: \'" + nombre + "'");
        //Los extremos abren y cierran cadena y \" es el que escapa el caracter especial para consola.
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
