import java.util.Scanner;
// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter number b: ");
        int b = scanner.nextInt();
        if (b > a) {
            System.out.println(b + " is bigger");
        } else if (a > b) {
            System.out.println(a + " is bigger");
        } else {
            System.out.println("The two numbers are equal");
        }
    }
}
