package src.PalabraInstanceOf;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Leonardo", 6000);
        System.out.println("\nRespuesta de objetos relacionados: ");
        Gerente gerente = new Gerente("Karla", 1000, "Contabilidad");
        determinarTipo(empleado);
        System.out.println("\nPara objeto tipo Gerente:");
        determinarTipo(gerente);
        System.out.println("\nCondiciones ligadas:");
        determinarTipoIfLigados(gerente);


    }

    //Se imprimirán todas las salidas en dónde el objeto tenga relación con objetos padres
    public static void determinarTipo(Empleado empleado){
        //Se debe preguntar de más específico a menos específico.
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
        }

        if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }

        if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

    //La respuesta no será la misma ya que las condiciones estan ligadas.
    public static void determinarTipoIfLigados(Empleado empleado){
        //Se debe preguntar de más específico a menos específico.
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
