package JavaCourse_Section_18_JUnit_Challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;
    //private ArrayList<String> array;

    @Before
    public void setup(){
        utilities = new Utilities();
        System.out.println("starting test");
    }
    @Test
    public void everyNthChar() {
        char arrayInput[] = {'h', 'e', 'l', 'l', 'o'};
        char arrayOutput[] = {'e', 'l'};
        assertArrayEquals(utilities.everyNthChar(arrayInput, 2), arrayOutput);
}

    @Test
    public void removePairs() {

        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull(null,utilities.removePairs(null) );
    }

    @Test
    public void convered() {
        fail("not implemented");
    }

    @Test
    public void nullifOddLenght() {
        fail("not implemented");
    }

}