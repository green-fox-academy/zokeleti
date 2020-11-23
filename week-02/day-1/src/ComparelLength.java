public class ComparelLength {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        String result = "";
        if (firstArrayOfNumbers.length == secondArrayOfNumbers.length){
            System.out.println("The length of the two arrays are equal");
        }
        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length){
            result = "firstArrayOfNumbers";
        }
        else if (firstArrayOfNumbers.length > secondArrayOfNumbers.length){
            result = "secondArrayOfNumbers";
        }
        System.out.println(result + " is longer");
    }
}
