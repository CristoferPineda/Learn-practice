

public class Logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean aIgualB = (a == b);
        boolean aMenorB = (a < b);
        boolean bMayorA = (b > a);

        boolean resultadoAND = aMenorB && bMayorA;
        System.out.println("a < b && b > a: " + resultadoAND);//true

        boolean resultadoOR = aIgualB || aMenorB;
        System.out.println("a == b || a < b: " + resultadoOR);//true

        boolean resultadoNOT = !aMenorB;
        System.out.println("!(a < b): " + resultadoNOT);//false

        boolean resultadoCombinado = (a != b) && !(a >= b);
        System.out.println("(a != b) && !(a >= b): " + resultadoCombinado);//true
    }
}

