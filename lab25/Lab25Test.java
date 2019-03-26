package lab25.converselystring;

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
public class Lab25ConverselyStringTest {
    
    public Lab25ConverselyStringTest() {
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
    public void testReverseEmptyString() {
        System.out.println("testReverseEmptyString");
        String s = "";
        String expResult = "";
        String result = Lab25ConverselyString.reverseString(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testPalindromString() {
        System.out.println("testPalindromString: abccab");
        String s = "abccba";
        String expResult = "abccba";
        String result = Lab25ConverselyString.reverseString(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testString() {
        System.out.println("testString: Автомобиль");
        String s = "Автомобиль";
        String expResult = "ьлибомотвА";
        String result = Lab25ConverselyString.reverseString(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPalindromStringWithNumbers() {
        System.out.println("testStringWithNumbers: Фара12321");
        String s = "Фара12321";
        String expResult = "12321араФ";
        String result = Lab25ConverselyString.reverseString(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPalindromStringWithNumbersAndOtherSymbols() {
        System.out.println("testStringWithNumbersAndOtherSymbols: Колесо. Жалко поклаж. Оселок. ");
        String s = "Колесо. Жалко поклаж. Оселок. ";
        String expResult = " .колесО .жалкоп оклаЖ .оселоК";
        String result = Lab25ConverselyString.reverseString(s);
        assertEquals(expResult, result);
    }
     
}
