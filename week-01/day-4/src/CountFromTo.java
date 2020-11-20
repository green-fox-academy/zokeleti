import java.util.Scanner;

public class CountFromTo {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter a second number");
        int second = scanner.nextInt();
        if (second <= first){
            System.out.println("The second number should be bigger");
        } else {
            for (int i = first; i < second; i++){
                System.out.println(i);
            }
        }
    }
}
