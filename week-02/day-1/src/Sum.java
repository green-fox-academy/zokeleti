
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

import java.util.Scanner;

public class Sum {
    public static int sum(int until){
        int sumsum = 0;
        for (int i = 0; i < until; i++){
            sumsum += i;
        }
        return sumsum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int number = scanner.nextInt();
        System.out.println(sum(number));

    }
}
