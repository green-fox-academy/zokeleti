import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximum {

    // Write a function that finds the largest element of an array using recursion.

    public static int[] addToArray(int[]oldArray, int n){
        int[] newArray = new int[oldArray.length-1];
        for (int i = 0; i < newArray.length - 1; i++){
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length-1] = n;
        return newArray;
    }

    public static int findMax(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            if(array[array.length-1] >= array[array.length-2]){
                return findMax(addToArray(array, array[array.length-1]));
            } else {
                return findMax(addToArray(array, array[array.length-2]));
            }
        }
}

    public static void main(String[] args) {
        int[] testArray = {3, 6, 115, 91, 11, 47, 91};
        System.out.println(findMax(testArray));
    }
}
