public class Bunnies {

    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).

    public static int earSum(int n){
        if (n == 1){
            return 2;
        } else {
            return 2 + earSum(n-1);
        }
    }
    public static void main(String[] args) {

        System.out.println(earSum(15));

    }
}
