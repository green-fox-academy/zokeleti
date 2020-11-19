import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometres = miles * 1.609;
        System.out.println("The distance you entered in miles converted to kilometres: " + kilometres);
    }
}