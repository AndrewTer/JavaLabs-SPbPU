package lab5.minlist;

import java.util.*;
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
public class Lab5MinListTest {
    
    public Lab5MinListTest() {
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
    public void findIntegerMinInFullRange() {
        Lab5MinList<Integer> minInRangeClass = new Lab5MinList<>();
        List<Integer> inputIntegerList = Arrays.asList(1, 2, 3);

        System.out.println("findIntegerMinInFullRange[0 3) 1 2 3");
        assertEquals((Integer)1, minInRangeClass.minElementListInRange(0, 3, inputIntegerList));
    }

    @Test
    public void findIntegerMinInPartOfList() {
        Lab5MinList<Integer> minInRangeClass = new Lab5MinList<>();
        List<Integer> inputIntegerList = Arrays.asList(1, 2, -5);

        System.out.println("findIntegerMinInPartOfList[0 2) 1 2 -5");
        assertEquals((Integer)1, minInRangeClass.minElementListInRange(0, 2, inputIntegerList));
    }

    @Test
    public void findDoubleMinInFullRange() {
        Lab5MinList<Double> minInRangeClass = new Lab5MinList<>();
        List<Double> inputIntegerList = Arrays.asList(1.1, 2.2, 0.5);

        System.out.println("findDoubleMinInFullRange[0 3) 1.1 2.2 0.5");
        assertEquals((Double)0.5, minInRangeClass.minElementListInRange(0, 3, inputIntegerList));
    }

    @Test
    public void findDoubleMinInPartOfList() {
        Lab5MinList<Double> minInRangeClass = new Lab5MinList<>();
        List<Double> inputIntegerList = Arrays.asList(1.1, 2.2, -5.5);

        System.out.println("findDoubleMinInPartOfList[0 2) 1.1 2.2 -5.5");
        assertEquals((Double)1.1, minInRangeClass.minElementListInRange(0, 2, inputIntegerList));
    }

    @Test
    public void findStringMinInFullRange() {
        Lab5MinList<String> minInRangeClass = new Lab5MinList<>();
        List<String> inputStringList = Arrays.asList("zz", "yy", "x");

        System.out.println("findStringMinInFullRange[0 3) zz yy x");
        assertEquals("x", minInRangeClass.minElementListInRange(0, 3, inputStringList));
    }

}
