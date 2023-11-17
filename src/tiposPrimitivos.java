package src;

public class tiposPrimitivos {
    public static void main(String[] args) {
        /*
         * Tipos primitivos enteros: byte, short, int, long
         */

        byte numero = 10;
        //Pérdida de precisión
        //byte numero = 128;
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);
    }
}
