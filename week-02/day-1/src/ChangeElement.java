// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element
public class ChangeElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 5, 6};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 8){
                numbers[i] = 4;
            }
        }
        System.out.println("This is the fourth element of the array: " + numbers[3]);
    }
}
