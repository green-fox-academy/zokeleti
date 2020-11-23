// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] reversedNumbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            reversedNumbers[numbers.length -1 -i ] = numbers[i];
        }
        for (int j = 0; j < numbers.length; j++){
            numbers[j] = reversedNumbers[j];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
