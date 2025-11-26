public class forEachNotes {

    public static void main(String[] args){
        int[] puntajes = { 85, 92, 78, 95 };

// El bucle for-each sirve para leer o acceder a cada elemento de un arreglo , no es para modificar valores del arreglo
// for(tipoDato nomVar : nomArray/colector){
//     codigo a ejecturar
// }
        for (int puntaje : puntajes) {
            System.out.println("Puntaje obtenido: " + puntaje);
        }
        /*
         *
         * Puntaje obtenido:85
         * Puntaje obtenido:92
         * Puntaje obtenido:78
         * Puntaje obtenido:95*/

        //Ejemplo donde se usa un for normal para modioficar arreglo y un for each para impresion
        //
        int[] arrayInt = { 1, 2, 3, 4, 5, 6 };

// Bucle FOR TRADICIONAL para modificar el arreglo
        for (int i = 0; i < arrayInt.length; i++) {
            // Accedemos a la posición [i] del arreglo para modificar su valor
            arrayInt[i] = arrayInt[i] * arrayInt[i];//multiplica el valor por si mismo
        }
// Bucle for-each para la impresión
        for (int valueInt : arrayInt) {
            System.out.println(valueInt);
        }
        /*Salida
        * 1
        * 4
        * 9
        * 25
        * 36 */


        //Ejemplo encontrar el valor Max con for each y cambiar valores con for normal
        //
        int[] array = { 5, 10, 0, -5, 16, -2 };
        int max = array[0]; // Inicializa max con index 0 osea valor 5

        for (int value : array) { // Primer bucle: for-each
            if (max < value) {
                max = value;
            }//hasta aqui el for each recorrio los valores del array y se asigno el valor maximo del array a max
            for (int i = 0; i < array.length; i++) { // Segundo bucle: for tradicional
                if (array[i] < 0) {//recorre todos los elementos del array y entraran al bucle los menores a 0
                    array[i] = max; // Remplaza los valores negativos con max osea con 16
                }
                System.out.println("array[" + i + "]= "+ array[i]);

                /*Salida
                * 5
                * 10
                * 0
                * 16
                * 16
                * 16 */
            }
        }
    }
}
