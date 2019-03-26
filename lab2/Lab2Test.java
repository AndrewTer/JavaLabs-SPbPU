package lab2;


import static lab2.Lab2.min;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author terehin.andrey
 */

public class Lab2Test {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void findMin() {
        System.out.println("findMin 1 2 3");
        assertEquals(1, min(1, 2, 3));
    }

    @Test
    public void findMinWithNegativeValues() {
        System.out.println("findMinWithNegativeValues -1 -2 -3");
        assertEquals(-3, min(-1, -2, -3));
    }

    /**
     * Test of min method, of class Lab2.
     */
    @Test
    public void testMin() {
        System.out.println("min 0 0 0");
        int a = 0;
        int b = 0;
        int c = 0;
        int expResult = 0;
        int result = Lab2.min(a, b, c);
        assertEquals(expResult, result);
    }
}
