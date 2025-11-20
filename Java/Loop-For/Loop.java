public class Loop {

    public static void main(String[] args){
        // Inicialización: int i = 1; (i empieza en 1)
        // Condición: i <= 5; (el ciclo se repite mientras i sea menor o igual a 5)
        // Actualización: i++; (i se incrementa en 1 después de cada iteración)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración número: " + i);
        }

        System.out.println("Fin del ciclo.");
        //Inicia con el valor de 1 , pasa a la condicion y como cuample la condiicon de i<=5 , pasa al post incremento
        //Se imprimira el valor actual osea 1 y despues su valor incrementara en 1 , por lo que el siguiente valor en entrar al ciclo es 2
        //Y asi se ira consecutivamente hasta que la condicion no se cumpla osea cuando i >= 6

        /*Impresion en consola
        Iteración número:1
        Iteración número:2
        Iteración número:3
        Iteración número:4
        Iteración número:5
        Fin del ciclo.
        * */
    }

}
