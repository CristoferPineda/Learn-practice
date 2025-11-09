

public class Bitwise_Operators {
    public static void main (String[] args) {
        int a = 60; //60 en binario es 00111100
        int b = 13; //13 en binario es 00001101

        // & And produce 1 en el bit de resultado solo si ambos bit de comparacion son 1
        // | Or  produce 1 en el bit de resultado si almenos hay un 1 en la comparacion
        // ^ XOR produce 1 un en el bit de resultado solo si hay un unico 1 en la comparacion
        // ~ Bitwise NOT invierte el valor de cada bit 0 a 1 , 1 a 0
        //<< Left shift Se recorren los valores de derecha a isquierda , se agregan 0 a la derecha y el valor de la isquierda desaparece
        //>> Right shift Lo mismo que el left pero al reves


        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111
    }
}
