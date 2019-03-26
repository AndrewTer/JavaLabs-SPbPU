package lab23.palindrom;

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
public class Lab23PalindromTest {
    
    public Lab23PalindromTest() {
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
    public void testPalindromString() {
        System.out.println("testReverseStringWithTrue: abccab");
        String s = "abccba";
        Lab23Palindrom instance = new Lab23Palindrom();
        boolean expResult = true;
        boolean result = instance.isPalindrom(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNoPalindromString() {
        System.out.println("testNoPalindromString: Автомобиль");
        String s = "Автомобиль";
        Lab23Palindrom instance = new Lab23Palindrom();
        boolean expResult = false;
        boolean result = instance.isPalindrom(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPalindromStringWithUppercase() {
        System.out.println("testPalindromStringWithUppercase: Заказ");
        String s = "Заказ";
        Lab23Palindrom instance = new Lab23Palindrom();
        boolean expResult = true;
        boolean result = instance.isPalindrom(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPalindromStringWithNumbers() {
        System.out.println("testPalindromStringWithNumbers: 12321");
        String s = "12321";
        Lab23Palindrom instance = new Lab23Palindrom();
        boolean expResult = true;
        boolean result = instance.isPalindrom(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPalindromStringWithNumbersAndOtherSymbols() {
        System.out.println("testPalindromStringWithNumbersAndOtherSymbols: Колесо. Жалко поклаж. Оселок. ");
        String s = "Колесо. Жалко поклаж. Оселок. ";
        Lab23Palindrom instance = new Lab23Palindrom();
        boolean expResult = true;
        boolean result = instance.isPalindrom(s);
        assertEquals(expResult, result);
    }
    
}
