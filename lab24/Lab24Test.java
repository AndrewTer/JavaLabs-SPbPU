package lab24.speed;

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

public class Lab24SpeedTest {
    
    public Lab24SpeedTest() {
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
    public void testWithIntegerValues() {
        System.out.println("testWithIntegerValues: s=12 t=3 | 4 м/мин");
        int s = 12;
        int t = 3;
        double expResult = 0.24;
        double result = Lab24Speed.speedFunc(s, t);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testWithDoubleValues() {
        System.out.println("testWithDoubleValues: s=15.5 t=2.5 | 6.2 м/мин");
        double s = 15.5;
        double t = 2.5;
        double expResult = 0.372;
        double result = Lab24Speed.speedFunc(s, t);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testWithIntegerAndDoubleValues() {
        System.out.println("testWithIntegerAndDoubleValues: s=62.5 t=5 | 12.5 м/мин");
        double s = 62.5;
        int t = 5;
        double expResult = 0.75;
        double result = Lab24Speed.speedFunc(s, t);
        assertEquals(expResult, result, 0.0);
    }
    
}
