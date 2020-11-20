import java.util.Scanner;

public class DrawTriangle {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int number = scanner.nextInt();
        String line = "";
        for (int i = 0; i < number; i++){
            line = line + "*";
            System.out.println(line);
        }
    }
}
