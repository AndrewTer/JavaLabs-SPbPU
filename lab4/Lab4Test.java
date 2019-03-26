package lab4.swapinlist;

import java.util.Arrays;
import java.util.List;
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
public class Lab4SwapInListTest {
    
    public Lab4SwapInListTest() {
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
    public void swapIntegers() {
        Lab4SwapInList<Integer> integerSwapInList = new Lab4SwapInList<>();

        List<Integer> inputIntegerList = Arrays.asList(1, 2, 3);
        List<Integer> expectedIntegerList = Arrays.asList(2, 1, 3);
        
        System.out.println("swapIntegers 1 2 3");
        assertEquals(expectedIntegerList, integerSwapInList.swap(0, 1, inputIntegerList));
    }

    @Test
    public void swapStrings() {
        Lab4SwapInList<String> stringSwapInList = new Lab4SwapInList<>();

        List<String> inputStringList = Arrays.asList("x", "y", "z");
        List<String> expectedStringList = Arrays.asList("x", "z", "y");

        System.out.println("swapStrings x y z");
        assertEquals(expectedStringList, stringSwapInList.swap(1, 2, inputStringList));
    }

    @Test
    public void swapDoubles() {
        Lab4SwapInList<Double> doubleSwapInList = new Lab4SwapInList<>();

        List<Double> inputDoubleList = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> expectedDoubleList = Arrays.asList(2.0, 1.0, 3.0);

        System.out.println("swapDoubles 1.0 2.0 3.0");
        assertEquals(expectedDoubleList, doubleSwapInList.swap(0, 1, inputDoubleList));
    }

}
