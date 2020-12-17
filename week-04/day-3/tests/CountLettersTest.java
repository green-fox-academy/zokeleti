import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters countLetters;
    @Before
    public void setup(){
        countLetters = new CountLetters();
    }

    @Test
    public void testWithOneOccurrence() {
        String string = "abcdef";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put( "a".charAt(0), 1);
        expected.put( "b".charAt(0), 1);
        expected.put( "c".charAt(0), 1);
        expected.put( "d".charAt(0), 1);
        expected.put( "e".charAt(0), 1);
        expected.put( "f".charAt(0), 1);
        assertEquals(expected, countLetters.countLetters(string));
    }
    @Test
    public void testWithMultipleOccurrence() {
        String string = "abcdefedfcbd";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put( "a".charAt(0), 1);
        expected.put( "b".charAt(0), 2);
        expected.put( "c".charAt(0), 2);
        expected.put( "d".charAt(0), 3);
        expected.put( "e".charAt(0), 2);
        expected.put( "f".charAt(0), 2);
        assertEquals(expected, countLetters.countLetters(string));
    }
    @Test
    public void testWithEmptyString() {
        String string = "";
        HashMap<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, countLetters.countLetters(string));
    }
}