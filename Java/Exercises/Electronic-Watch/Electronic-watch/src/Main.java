//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        //86400 segundos que hay en un dia
        int secondsInDay = seconds % 86400;
        int s = secondsInDay % 60; //Calcular segundos
        int totalMinutes = secondsInDay / 60; //Calcular minutos
        int m =totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int h = totalHours % 24;

        String formatMinutes;
        String formatSeconds;

        //format Minutes
        if(m < 10){
            formatMinutes = "0" + m;//si es menor a 10 se agrega un cero al inicio
        }else {
            formatMinutes = String.valueOf(m);//
        }

        //Format Secconds
        if (s < 10){
            formatSeconds = "0" + s;
        }else {
            formatSeconds = String.valueOf(s);
        }


        String output = h + ":" + formatMinutes + ":" + formatSeconds;
        System.out.println(output);


    }
}