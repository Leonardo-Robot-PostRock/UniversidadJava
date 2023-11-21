package src;

public class operadorUnario {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1.preincremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e; //primero se incrementa la variable y después se una su valor.
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.postincremento (símbolo después de la variable)
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);//primero se utiliza el valor y después se incrementa
        System.out.println("h = " + h);//teníamos pendiente un incremento
        
        //decremento
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//ya está decrementada
        System.out.println("j = " + j);//
        
        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valor de la variable  y queda pendiente el decremento
        System.out.println("k = " + k);//tenia pendiente un decremento
        System.out.println("l = " + l);
        
    }
}
