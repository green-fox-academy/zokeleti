import java.util.Scanner;
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4.4
public class AverageOfInput {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("Please enter number number" + i + ": ");
            sum += scanner.nextInt();
        }
        int ave = sum / 5;
        System.out.println("The sum of the given numbers is: " + sum);
        System.out.print("The average of the given numbers is: " + ave);
    }
}
