

public class Arithmetic_Operators {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=25;
        int d=25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b % a  = " + (b % a)); //El residuo de dividir 20/10 es 0
        System.out.println("c % a  = " + (c % a)); //El residuo de dividir 25 entre 10 es 5
        System.out.println("a++    = " +  (a++)); //Post-Increase en esta linea a sigue valiendo 10 y eso imprimira esta linea , pero el nuevo valor de a sera 11 despues
        System.out.println("a--    = " +  (a--)); //post-decrease en esta linea se imprime el valor actual de a que es 11 por el post-increase de la linea anterior , pero el nuevo valor de a sera 10 despues
        System.out.println("d++    = " +  (d++)); //Post-Increase el valor de d es el mismo que el inicial 25 es lo que imprimira esta linea , pero despues se incrementara en 1 el valor de d es 26
        System.out.println("++d    = " +  (++d)); //pre-Increase al valor actual de d se le asigna uno antes de imprimir , por la linea anterior es 26 y con esta linea pasa a ser 27
        System.out.println("a += b = " + (a += b)); //Compound Assignment/Shorthand Assignment , a += b	seria lo mismo a escribir "a = a + b" por lo tanto	a = 10 + 20 y el resultado seria 30
        System.out.println("a      = " + (a)); //Imprime el nuevo valor de a que por la linea anterior seria 30
        System.out.println("a -= b = " + (a -= b)); //Shorthand assignament a-=b pasa a ser "a = a-b" el valor actual de a es 30 por lo que seria 30-20 y ese seria el nuevo valor de a , a vale 10
        System.out.println("a      = " + (a)); //por la linea anterior a vale 10



    }
}
