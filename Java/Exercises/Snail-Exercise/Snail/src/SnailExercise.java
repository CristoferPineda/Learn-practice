import java.util.Scanner;

public class SnailExercise {

    public static void main(String[] args){
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scan = new Scanner(System.in);
        //input data
        //a is the number of feet climbed per day, b is the number of feet lowered per day, h is the height of the tree
        System.out.println("Cuantos pies subira por dia el caracol? ");
        int a = scan.nextInt();
        System.out.println("Cuantos pies se deslizara hacia abajo el caracol durante la noche? ");
        int b = scan.nextInt();
        System.out.println("Cual es la altura del arbol que escalara el caracol? ");
        int h = scan.nextInt();

        if(a >= h){
            System.out.println("Dias que tardara el caracol en llegar a la cima del arbol: 1");
        }else if (a <= b){
            System.out.println("Impossible");
        }else {
            int distanciaRestante = h - a;
            int distanciaPorDia = a - b;

            int dias = (distanciaRestante + distanciaPorDia - 1) / distanciaPorDia;
            //Add 1 for the first day
            int diasTotales = dias + 1;

            System.out.println("Dias que tardara el caracol en llegar a la cima del arbol: " + diasTotales);


        }

    }
}
