package src;

public class operadorTernario {
    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        
        resultado = (numero % 2 == 0) ? "número par" : "número impar";
        System.out.println("numero = " + numero);
    }
}
