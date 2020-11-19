
public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22;
        int b = 13;
        // Print the result of 13 added to 22
        int sum = a + b;
        System.out.println(sum);
        // Print the result of 13 substracted from 22
        int dif = a - b;
        System.out.println(dif);
        // Print the result of 22 multiplied by 13
        int multi = a * b;
        System.out.println(multi);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        double accurateDivision = (double) a / b;
        System.out.println(accurateDivision);
        // Print the integer part of 22 divided by 13
        System.out.println(a / b);
        // Print the remainder of 22 divided by 13
        System.out.println(a % b);
    }
}