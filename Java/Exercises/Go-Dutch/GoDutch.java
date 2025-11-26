import java.util.Scanner;

public class GoDutch {
/*Consider a company of friends visiting a restaurant. They decided to equally split the bill.
Friends decided to add 10 percent of the bill total amount as tips.
Then they cover the total payment in equal parts.
Please, proceed to GoDutch class and write a program that reads a bill total amount
and a number of friends, and then prints part to pay.
Consider some details:
Program must read data from System.in
Bill total amount cannot be negative. If input value is negative, the program stops, printing: Bill total amount cannot be negative
Number of friends cannot be negative or zero. If input value is, then the program stops, printing: Number of friends cannot be negative or zero
Bill total amount, number of friends and part to pay are integers */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //intput bill acount
        System.out.println("Input total bill acount: ");
        int billAcount = scan.nextInt();
        //input number of frinds
        System.out.println("Input number of frinds: ");
        int numberFriends = scan.nextInt();

        if(billAcount < 0){
            System.out.println("Bill total amount cannot be negative");
        }else if (numberFriends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }else{
            //add 10%
            int tipBill = ((billAcount * 110)/100);
            int individualBill = tipBill/numberFriends;

            System.out.println("Price per person: " + individualBill);
        }
    }
}

