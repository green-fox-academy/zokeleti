import java.util.Scanner;

public class DrawSquare {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int lines = scanner.nextInt();
        String topBottom = "";
        for (int i = 0; i < lines; i++){
            topBottom = topBottom + "%";
        }
        System.out.println(topBottom);
        String sides = "";
        for (int i = 0; i < lines -2; i++){
            sides = sides + " ";
        }
        sides = "%" + sides + "%";
        for (int i = 0; i < lines - 2; i++){
            System.out.println(sides);
        }
        System.out.println(topBottom);
    }
}