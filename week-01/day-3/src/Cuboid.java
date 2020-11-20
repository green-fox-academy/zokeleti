import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give the first dimension and press Enter: a = ");
        double a = scanner.nextDouble();
        System.out.print("Please give the first dimension and press Enter: b = ");
        double b = scanner.nextDouble();
        System.out.print("Please give the first dimension and press Enter: c = ");
        double c = scanner.nextDouble();
        double surfaceArea = (a * b + a * c + b * c) * 2;
        double volume = a * b * c;
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);


    }
}
