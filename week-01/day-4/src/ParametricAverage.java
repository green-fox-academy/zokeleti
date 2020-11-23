import java.util.Scanner;
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double num;
        System.out.print("Please enter how many numbers you'd like to get the average of: ");
        double numOfNums = scanner.nextDouble();
        for (int i = 0; i < numOfNums; i++){
            System.out.print("Please enter a number: ");
            num = scanner.nextDouble();
            sum += num;
        }
        System.out.println("Sum: " + sum + " Average: " + sum/numOfNums);
    }
}
