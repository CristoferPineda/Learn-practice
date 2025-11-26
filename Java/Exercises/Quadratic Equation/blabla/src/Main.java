import java.util.Locale;
import java.util.Scanner;

public class quadraticEquation {
    /*Please, proceed to the QuadraticEquation class and implement a program to solve quadratic equations.

For the given quadratic equation coefficients (ax2 + bx + c = 0), return one or two roots of the equation if there is any in the set of real numbers.
Input value is given via System.in. Output value must be printed to System.out.

Output format is:
x1 x2 (two roots in any order separated by space) if there are two roots,
x1 (just the value of the root) if there is the only root,
no roots (just a string value "no roots") if there is no root.
The a parameter is guaranteed to be not zero. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        //Determinant= b^2 -4(a)(c)
        double discriminant = (Math.pow(b, 2)) - 4 * (a * c);
        //If discriminant is greater than zero it means the ecuation have 2 roots
        if (discriminant > 0) {
            double x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            double x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
            //Math.min y Math.max to order because in the platform I have 0/100
            //Prueba para ver si es el orden
            double x_menor = Math.min(x1, x2); // Garantiza que sea la primera
            double x_mayor = Math.max(x1, x2); // Garantiza que sea la segunda
            System.out.println(x_menor + " " + x_mayor);
            //If discriminant is equals to zero it means the ecuation have 1 roots
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
            //If discriminant is smaller than zero it means the ecuation no have roots
        } else
            System.out.println("no roots");
    }
}
}
