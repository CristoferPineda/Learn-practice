public class TwoDimesionalArrays {

    public static void main (String[] args){
        //Es un array dentro de otro(Matrizes o tablas)

        //Creacion(Instansacion)
        //tipDato   nomMatriz = new tipoDato[numFilas][numColum]
           int[][] matriz3x4 = new int[3][4];


        //Inicializacion directa
        //Puedes inicializar la matriz directamente usando llaves anidadas (llaves dentro de llaves), donde cada llave interna representa una fila
        int[][] tablero = {
                // Fila 0
                { 10, 20, 30 },
                // Fila 1
                { 40, 50, 60 },
                // Fila 2
                { 70, 80, 90 }
        };

        //Acceder, asignar o  modificar un elemento , usa ambos indicies [Fila][Columna]
        //Acceder
        int valor = tablero[1][2]; // valor = 60

        //modificar. Ejemplo:Modifica el elemento en la Fila 0, Columna
        tablero[0][0]=5;


        // Bucle para recorrer la matriz
        //
        for (int i = 0; i < tablero.length; i++) {       // Bucle exterior: Itera sobre las FILAS
            for (int j = 0; j < tablero[i].length; j++) { // Bucle interior: Itera sobre las COLUMNAS
                System.out.print(tablero[i][j] + " ");
                //print + " " y un println en el bucle exterior es para que la matriz tenga un formato legible
            }
            System.out.println(); // Se explica comentario anterior
        }
        //Salida
        //5 20 30
        //40 50 60
        //70 80 90

        //Suma interna de datos de una matriz
        //ejercicio
        int[][] datos = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sumaTotal = 0;//Variable donde se guardara el resultadp

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                sumaTotal += datos[i][j]; // o sumaTotal = sumaTotal + datos[i][j];
                //se usa el operador de asignacion compuesta funciona de la siguiente manera
                //variable += valor a agregar , (suma y asigna)
            }
        }

        System.out.println("La suma total de la matriz es: " + sumaTotal);//Salida 45

    }
}
