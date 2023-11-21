package src;

public class operadoresRelacionales {
    public static void main(String[] args) {
        int a = 3, b = 3;
        var g = a >= b;

        System.out.println("g = " + g);

        if(a % 2 == 0)
            System.out.println("Es número par");
        else
            System.out.println("Es número impar");

        var edad = 30;
        var adulto = 18;

        if(edad >=adulto)
            System.out.println("Es un adulto");
        else
            System.out.println("Es menor de edad");


    }
}
