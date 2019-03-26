package lab8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terehin.andrey
 */
public class Lab8Test {
    
    public Lab8Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void removePairedLetters() {
        assertEquals("", Lab8.removePairedLetters("aa"));
    }

    @Test
    public void removeTwoPairedLetters() {
        assertEquals("", Lab8.removePairedLetters("aabb"));
    }

    @Test
    public void removePairedLettersAndLeftOneLetter() {
        assertEquals("b", Lab8.removePairedLetters("aab"));
    }

    @Test
    public void nothingToRemove() {
        assertEquals("abfbaf", Lab8.removePairedLetters("abfbaf"));
    }

    @Test
    public void removeAllPairedLettersBesidesOneLetter() {
        assertEquals("f", Lab8.removePairedLetters("abccbaf"));
    }

    @Test
    public void findPairedLetters() {
        assertEquals("aa", Lab8.findPairedLetters("aa"));
    }
    
    @Test
    public void findPairedSLetters() {
        assertEquals("1", Lab8.removePairedLetters("abba1"));
    }
}
