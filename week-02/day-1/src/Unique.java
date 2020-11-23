import java.util.Arrays;

public class Unique {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
    public static boolean notContains(int a, int[] toCheck){
        for (int i = 0; i < toCheck.length;  i++){
            if (a == toCheck[i]){
                return false;
            }
        }
        return true;
    }
    public static int[] unique(int[] array){
        int[] result = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (notContains(array[i], result)){
                result[counter] = array[i];
                counter += 1;
                continue;
            }
        }
        int[] finalResult = new int[counter];
        for (int j = 0; j < finalResult.length; j++){
            finalResult[j] = result[j];

        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));

    }
}