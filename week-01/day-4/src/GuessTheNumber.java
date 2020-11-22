import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player A please enter a positive integer: ");
        int number = scanner.nextInt();
        int guess;
        do {
            System.out.print("Please enter a guess: ");
            guess = scanner.nextInt();
            if (guess > number){
                System.out.println("The number is smaller than your guess");
            }
            else if (guess < number){
                System.out.println("The number is bigger than your guess");
            } else {
                System.out.println("Ta-daaa You guessed the number");
            }
        } while (number != guess);
    }

}

