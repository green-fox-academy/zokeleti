public class Numbers {
    public static void main(String[] args) {
        int[] numbers = {54, 23, 66, 12};
        int sum = 0;
        for (int i = 1; i < 3; i++){
            sum += numbers[i];
        }
        System.out.println("The sum of the second and the third element is " + sum);
    }
}
