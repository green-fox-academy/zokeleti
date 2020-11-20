import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int lines = scanner.nextInt();
        int spaces = lines * 2 - 1;
        String stars = "*";
        String filler = "";

        for (int i = 0; i < lines; i++) {
            filler = "";
            for (int j = 0; j < spaces; j++) {
                filler = filler + " ";
            }
            System.out.println(filler + stars + filler);
            spaces -= 1;
            stars = "*" + stars + "*";

        }
        if (lines % 2 == 0){
            System.out.println("");
        }

    }

}
