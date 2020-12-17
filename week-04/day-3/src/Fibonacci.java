public class Fibonacci {

    public static long fibonacci(long n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static long fibonacciWithLoop(long m){
        long n = m - 1;
        if (n < 0 || n > 93){
            throw new IllegalArgumentException();
        }
        if (n == 0){
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            long lastElement = 1;
            long result = 1;
            for (int i = 3; i <= n; i++){
                long temp = lastElement + result;
                lastElement = result;
                result = temp;
            }
            return result;
        }
    }

    public static void main(String[] args) {

        for (long i = 0; i < 1; i++){
            //System.out.println("this is the " + i + "th(st / nd / rd) fibonacci number: " + fibonacci(i));
            //System.out.println("this is the " + i + "th(st / nd / rd) fibonacci number with a loop: " + fibonacciWithLoop(i));
            System.out.println(fibonacciWithLoop(0));
        }
    }
}
