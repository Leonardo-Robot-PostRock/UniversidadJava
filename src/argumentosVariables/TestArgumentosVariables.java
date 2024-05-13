package src.argumentosVariables;

public class TestArgumentosVariables {
    public static void main(String[] args) {

        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Leonardo", 2, 2, 3, 5, 6);
    }

    //argumento variable debe estar al final
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre: " + nombre);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: " + numeros[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: " + numeros[i]);
        }
    }
}
