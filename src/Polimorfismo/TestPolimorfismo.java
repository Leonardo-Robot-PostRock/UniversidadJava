package src.Polimorfismo;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Leonardo", 6000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 1000, "Contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());

        imprimir(gerente);
        //Para aplicar el el polimorfismo es necesario que los métodos de la clase hija
        //no sean más restrictivos.Es decir que si el método en la clase Empleado es protected,
        //en Gerente, el método no puede ser private. Sólo puede ser de tipo protected, default/package
        //o public. Es decir es hacia menos restrictivo.
    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
