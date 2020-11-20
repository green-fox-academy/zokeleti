import java.util.Scanner;

public class MultiplicationTable {
    // Create a program that asks for a number and prints the multiplication table with that number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
