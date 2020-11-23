import java.util.Arrays;

public class SubInt {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    //  System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
    //  should print: `[0, 1, 4]`
    //  System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
    //  should print: '[]'

    // Note: We are using Arrays.toString() function as a way to print
    // array returned from subInt(). You could just as well iterate over array to print it.
    public static int[] subInt(int num, int[] array){
        int[] resArray = new int[array.length];
        Arrays.fill(resArray, -1);
        int counter = 0;
        String findIn = "";
        String findThis = String.valueOf(num);
        for (int i = 0; i < array.length; i++){
            if (String.valueOf(array[i]).contains(findThis)){
                resArray[counter] = i;
                counter += 1;
            }
        }
        int[] result = new int[counter];
        for (int i = 0; i < counter; i++){
            result[i] = resArray[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));

    }
}