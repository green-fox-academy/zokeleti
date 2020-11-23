//  Create the usual class wrapper
//  and main method on your own.

import java.util.Scanner;

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorial {
    public static int factorio(int num){
        int result = 1;
        for (int i = 2; i < num + 1; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number you want to calculate the factorial of: ");
        int num = scanner.nextInt();
        System.out.println("The factorial of " + num + " is " + factorio(num));
    }
}
