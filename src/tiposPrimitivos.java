package src;

public class tiposPrimitivos {
    public static void main(String[] args) {
        /*
         * Tipos primitivos enteros: byte, short, int, long
         */

        byte numero = 10;
        //Pérdida de precisión
        //byte numero = 128;
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;

        System.out.println("numeroShort = " + numeroShort);

        System.out.println("valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo short: " + Short.MAX_VALUE);

        //Solución a literal entera de que supera a un tipo entero se le agrega el literal L(Long)
        //Se convierte de un tipo entero de 32 bits a un tipo superior de 64 bits que puede ocupar un tipo Long
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("valor máximo int: " + Integer.MAX_VALUE);

        //Solución a literal entera de que supera a un tipo entero se le agrega el literal L(Long)
        //Como ya se supera al literal de tipo long entonces se debe usar un tipo literal F(Float)

        //En este caso se cambia el tipo entero por un literal de tipo L
        long numeroLong = 9223372036854775807L;
        System.out.println("númeroLong  = " + numeroLong);
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor mínimo long: " + Long.MAX_VALUE);
    }
}
