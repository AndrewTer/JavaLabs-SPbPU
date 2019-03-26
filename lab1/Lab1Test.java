package lab1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author terehin.andrey
 */
public class Lab1Test {
    
    public Lab1Test() {
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
    public void testSwaptwoElements() {
        System.out.println("testSwaptwoElements i=0 j=1");
        int[] arr = new int[]{11, 22, 33};
        boolean expResult = true;
        boolean result = Lab1.swap(0, 1, arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testSwapOutOfRangeIndexes() {
        System.out.println("testSwapOutOfRangeIndexes i=0 j=10");
        int[] arr = new int[]{11, 22, 33};
        boolean expResult = false;
        boolean result = Lab1.swap(0, 10, arr);
        assertEquals(false, result);
    }

    @Test
    public void testSwapZeroLengthArr() {
        System.out.println("testSwapZeroLengthArr");
        int[] arr = new int[]{};
        boolean expResult = false;
        boolean result = Lab1.swap(0, 1, arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testSwapIdenticalIndexes() {
        System.out.println("testSwapIdenticalIndexes i=1 j=1");
        int[] arr = new int[]{11, 22, 33};
        boolean expResult = true;
        boolean result = Lab1.swap(1, 1, arr);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSwapMinIndexes() {
        System.out.println("testSwapMinIndexes i=1 j=1");
        int[] arr = new int[]{11, 22, 33};
        boolean expResult = false;
        boolean result = Lab1.swap(-1, 1, arr);
        assertEquals(expResult, result);
    }

}
