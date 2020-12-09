import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    Apple apple;

    @Before
    public void setup(){
        apple = new Apple();
    }

    @Test
    public void testIfReturnsAppropriateValue() {
        assertEquals("apple" , apple.getApple());
    }
}