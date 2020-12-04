public class Power {

    // Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static int power(int b, int e){
        if (e == 0){
            return 1;
        } else {
            return b * power(b, e-1);
        }
    }
    public static void main(String[] args) {

        System.out.println(power(3, 3));

    }
}
