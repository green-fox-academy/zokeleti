import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name +"!");
    }
}