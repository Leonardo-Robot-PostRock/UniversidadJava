package src;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        int a = 3, b = 1;
        var resultado = a + b;

        System.out.println("resultado = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado = " + resultado);
        
        var resultado2 = 3D / b;
        System.out.println("resultado = " + resultado);
        
        resultado = a % b;
        System.out.println("resultado2 = " + resultado2);

        if(a % 2 == 0){
            System.out.println("Es número par");
        }else {
            System.out.println("Es número impar");
        }
    }
}
