import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void testFibonacciWithLoopFirstElement() {
        long expected = 1;
        long actual = fibonacci.fibonacciWithLoop(2);
        assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciWithLoopOutOfLongRange() {
        long expected = 0;
        long actual = fibonacci.fibonacciWithLoop(0);
        assertEquals(expected, actual);
    }
    @Test
    public void testFibonacciWithLoopHappyCase() {
        long expected = 2;
        long actual = fibonacci.fibonacciWithLoop(4);
        assertEquals(expected, actual);
    }
}