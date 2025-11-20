public class loopwhile {

    public static void main(String[] args){

        //El ciclo while se utiliza cuando no sabes cuantas veces vas a repetir el ciclo , se repetira siempre y cuando se cumpla la condicion
        //0 o mas veces

        // 1. Inicialización de la variable de control (contador)
        int i = 1;

        // 2. Condición: El ciclo se repite MIENTRAS 'i' sea menor o igual a 5
        while (i <= 5) {

            System.out.println("Iteración número: " + i);

            // 3. Actualización: Es fundamental para que el ciclo avance y eventualmente termine
            i++;
        }

        /*
        * for:Agrupa la inicialización, condición y actualización en una sola línea, lo que lo hace compacto y organizado,
        * especialmente para contadores predefinidos.

        * while: Solo evalúa la condición. Deja la inicialización fuera y la actualización dentro del cuerpo del ciclo.
        * Es más flexible y se usa a menudo para manejar situaciones donde la condición depende de la entrada del usuario,
        * la lectura de un archivo o alguna otra variable externa que no es un simple contador. */
    }
}
