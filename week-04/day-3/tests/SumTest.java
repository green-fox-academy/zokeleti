import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum;

    @Before
    public void setup(){
        sum = new Sum();
    }

    @Test
    public void testHappyCase() throws Exception {
        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        Integer expected = 14;
        assertEquals(expected, sum.sum(myList));
    }
    @Test
    public void testWithEmptyList() throws Exception {
        List<Integer> myList = new ArrayList<>();
        Integer expected = 0;
        assertEquals(expected, sum.sum(myList));
    }
    @Test
    public void testWithOneElement() throws Exception {
        List<Integer> myList = new ArrayList<>(Arrays.asList(2));
        Integer expected = 2;
        assertEquals(expected, sum.sum(myList));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWithNull() throws Exception {
        List<Integer> myList = null;
        Exception expected = new Exception();
        assertEquals(expected, sum.sum(myList));

    }
}



