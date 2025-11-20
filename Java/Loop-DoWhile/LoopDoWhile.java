public class LoopDoWhile {

    public static void main(String[] args){

        //El do-while garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa al final de cada iteración.
        //Es perfecto para menús interactivos o situaciones donde la primera acción debe ocurrir obligatoriamente.

        // 1. Inicialización de la variable de control (contador)
        int i = 1;

        do {

            System.out.println("Iteración número: " + i);

            // 2. Actualización: Asegura que el contador avance
            i++;

            // 3. Condición: Se evalúa DESPUÉS de ejecutar el bloque 'do'
        } while (i <= 5);

        System.out.println("Fin del ciclo.");
    }
}
