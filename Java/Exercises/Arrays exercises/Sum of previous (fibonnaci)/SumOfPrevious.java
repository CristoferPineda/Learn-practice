import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    //Coloca tu codigo aqui
    /*Please, proceed to SumOfPrevious class and implement getSumCheckArray method.
The correct implementation should receive an array of int values and return an array of booleans
where each element is a result of a check if a corresponding element is a sum of two previous elements in given array.
Details:
The length of given array is guaranteed to be 2 or more.
Given array is guaranteed to be not null.
Method returns an array of booleans where each element is a result for corresponding element in given array.
First two elements of the boolean array are always false.

Example
Input array: [1, -1, 0, 4, 6, 10, 15, 25]
Output array: [false, false, true, false, false, true, false, true] */


    public static boolean[] getSumCheckArray(int[] array){

        if(array == null){
            return new boolean[0];//garantiza que no entren valores null asignandoles un 0 (0 en arrays booleanos es false)
        }

        //
        int length = array.length;//la variable length guardara un valor numerico dependiendo de la longitud del array ejemplo: [0,2,3,4] //length=4
        //declaracion array booleano llamado result
        boolean[] result = new boolean[length]; // creando e inicializando el nuevo array booleano con las mismas entradas que el array inical

        //el bucle se inicializa con 2 porque no puede haber valores negativos en el indice , como el array ya fue inicializado el index[0] ,[1] ya son false
        for(int i=2; i<length; i++){
            //calcular la suma de los elementos anteriores , i-1 = dato anterior , 1-2= dos anteriores
            int previousSum = array[i-1] + array[i-2];
            //comprobar si son iguales
            result[i] = previousSum == array[i];
        }
        return result;

        //throw new UnsupportedOperationException();
    }
}
