import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagrammTest {
    Anagramm anagramm;

    @Before
    public void setup(){
        anagramm = new Anagramm();
    }

    @Test
    public void testWithAnagramms() {
        String string1 = "haha";
        String string2 = "ahha";
        assertTrue(anagramm.areAnagramms(string1, string2));
    }
    @Test
    public void testWithNotAnagramms() {
        String string1 = "hahaha";
        String string2 = "ahhamm";
        assertFalse(anagramm.areAnagramms(string1, string2));
    }
    @Test
    public void testWithUppercase() {
        String string1 = "Haha";
        String string2 = "Ahha";
        assertTrue(anagramm.areAnagramms(string1, string2));
    }
}