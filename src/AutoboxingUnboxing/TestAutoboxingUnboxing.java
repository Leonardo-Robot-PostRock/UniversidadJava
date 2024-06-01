package src.AutoboxingUnboxing;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        /*
        * int - Integer
        * long - Long
        * float - Float
        * double - Double
        * boolean - Boolean
        * byte - Byte
        * char - Character
        * short - Short
        */

        int entero = 10;

        //Autoboxing: envolver un tipo primitivo en un tipo Object.
        Integer entero2 = 10; //Las clases envolventes tienen acceso a métodos.
        System.out.println("entero = " + entero);
        System.out.println("entero2 = " + entero2);
        System.out.println("entero2 a string = " + entero2.toString());
        System.out.println("entero2 = " + entero2.doubleValue());

        int entero3 = entero2; //Unboxing
        System.out.println("entero3 = " + entero3);

    }
}
