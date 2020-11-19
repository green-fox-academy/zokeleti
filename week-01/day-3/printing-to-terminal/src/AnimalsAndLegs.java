import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of chickens you have: ");
        int chicken = scanner.nextInt();
        System.out.print("Please enter the number of pigs you own: ");
        int pigs = scanner.nextInt();
        String legsSum = String.valueOf(pigs * 4 + chicken * 2);
        System.out.println("Your animals have " + legsSum + " legs altogether");
    }
}