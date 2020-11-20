import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many girls came to the party: ");
        int girls = scanner.nextInt();
        System.out.print("Please enter how many boys came to the party: ");
        int boys = scanner.nextInt();
        if (boys == girls && girls + boys > 20) {
            System.out.println("The Party is excellent!");
        } else if (girls < 1){
            System.out.println("Sausage party");
        } else if (girls != boys && girls + boys > 20){
            System.out.println("Quiet cool Party");
        } else if (girls + boys < 20) {
            System.out.println("Average Party");
        }


    }
}