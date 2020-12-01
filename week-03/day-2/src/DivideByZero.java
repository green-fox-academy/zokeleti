import java.util.Scanner;

public class DivideByZero {

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static String divideTenBy(int divisor){
        try {
            return  Integer.toString((int)(10 / divisor));
        } catch (ArithmeticException ex){
            return "fail";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int divisor = scanner.nextInt();

        System.out.println(divideTenBy(divisor));
    }
}
