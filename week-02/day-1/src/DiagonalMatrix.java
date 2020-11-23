import java.util.Scanner;

// - Create (dynamically*) a two dimensional array
//   with the following matrix**. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
// * length should depend on a variable
// ** Relax, a matrix is just like an array
public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the diagonal: ");
        int diagonal = scanner.nextInt();
        for (int i = 0; i < diagonal; i++){
            for (int j = 0; j < diagonal; j++){
                if (i != j){
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
