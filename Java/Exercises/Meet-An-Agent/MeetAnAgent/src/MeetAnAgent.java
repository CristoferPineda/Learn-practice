import java.util.Scanner;

public class MeetAnAgent {
    /*Meet an Agent
The purpose of this exercise is to familiarize you with simple conditional statements.

Description
Please, proceed to MeetAnAgent class and write a program that:

asks for an input number,
if the input equals to the secret password number, prints "Hello, Agent",
otherwise, prints "Access denied"
Secret password is stored in final static int PASSWORD. */
    final static int PASSWORD = 133976; //You can change pass, but don't change the type
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password: ");
        int inputNumber = scan.nextInt();

        if(inputNumber == PASSWORD){
            System.out.println("Hello, Agent");
        }else{
            System.out.println("Access denied");
        }
    }
}
