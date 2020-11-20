import java.util.Scanner;

public class OddEven {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }

    }
}
