import java.util.Scanner;

public class MaxMethod {

    /*Please, proceed to the MaxMethod class and implement the max method.
The correct implementation should receive an array of int values and return its maximum value.
Details:
An input array is guaranteed to not be an empty array or null.
max method must not modify the array.
Input array may contain any int value between Integer.MIN_VALUE and Integer.MAX_VALUE.
Example
int[] vals = new int[]{-2, 0, 10, 5};
int result = MaxMethod.max(vals);
System.out.println(result == 10); // true */


    //Metodo para encontrar el valor mas grande
    public static int max(int[] values) {

        int maxValue = values[0];
        for (int element : values){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }

    //Interaccion con el usuario
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Solicitar el tamano del array
        System.out.println("Ingrese el numero de elementos del array: ");
        int size = scan.nextInt();

        //Crear el array con el tamano espesifico
        //tipoDato[] nomArray = new tipoDato [variable a llamar]
        int[] userArray = new int [size];

        //Pedir y llenar cada elemento del array
        System.out.println("Ingrese los valores del array: " );
        for (int i = 0; i < size; i++){
            System.out.println("Elemento " + (i + 1) + ": ");
            userArray[i] = scan.nextInt();
        }

        //llamar al metodo Max con el array del usuario
        int result = MaxMethod.max(userArray);

        //Mostrar el resultado
        System.out.println("El valor maximo del array es: " + result);
        //cerrar el objeto scanner
        scan.close();
    }
}

