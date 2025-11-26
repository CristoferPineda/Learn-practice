import java.util.Scanner;

public class PizzaSplitSlice {

    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of persons?:" );
        int numberPerson = scan.nextInt();
        System.out.println("Slices per Pizza?:" );
        int slicesPerPizza = scan.nextInt();

        //Inicializacion del bucle while(Logica de iteracion)
        int numPizzas = 1;
        // El ciclo 'while' busca la cantidad mínima de pizzas.
        // Itera mientras el Total de Rebanadas (numPizzas * slicesPerPerson) no sea divisible
        // entre el número de personas .
        while (true) {
            //Calcula el total de rebanadas
            int totalSlices = numPizzas * slicesPerPizza;
            //Comprueba si el resto de la divicion es 0
            if (totalSlices % numberPerson == 0) {
                // Si el resto es 0, hemos encontrado el número mínimo de pizzas
                // que satisface la condición.
                System.out.println("El numero de pizzas necesarias para que todos coman la misma cantidad y no sobren rebanadas es: " + numPizzas);
                break;//Sale del ciclo
            }
            // Si no se cumple la condición, necesitamos una pizza más , inicia de nuevo el ciclo
            numPizzas++;
        }


    }
}
