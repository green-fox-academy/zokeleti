public class MaxSum {

// Create a function called `maxSum` which
// expects an array of five integers as an input parameter and
// returns the maximum values that can be
// calculated by summing exactly four of the five integers.
//
// Examples
//
// [1 2 3 4 5] -> 14
//
// We can calculate the following sums using four of the five integers:
//
// 1 + 2 + 3 + 4 = 10
// 1 + 2 + 3 + 5 = 11
// 1 + 2 + 4 + 5 = 12
// 1 + 3 + 4 + 5 = 13
// 2 + 3 + 4 + 5 = 14

    public static int maxSum

    public static int maxSum(int[] array){
        int result = 0;
        if (array.length == 4){
            for (int element : array){
                result += element;
            }
            return result;
        } else {

        }
    }

    public static void main(String[] args) {

    }
}
