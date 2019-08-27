import org.junit.*;
import static org.junit.Assert.assertEquals;
public class FinderTests {
    //Tests findMax with a normal array
    @Test
    public void test_findMax1() {
        int[] intArray =  {1, 2, 9, 8, -15};
        Integer realResult = Finder.findMax(intArray);
        Integer expectedResult = 9;
        assertEquals(expectedResult,realResult);
    }

    //Tests findMax with a null array
    @Test
    public void test_findMax2() {
        int[] intArray =  null;
        Integer realResult = Finder.findMax(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,realResult);
    }

    //Tests findMax with an empty array
    @Test
    public void test_findMax3() {
        int[] intArray =  {};
        Integer realResult = Finder.findMax(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,realResult);
    }

    //Tests findMax with a normal array
    @Test
    public void test_findMin1() {
        int[] intArray =  {1, 2, 9, 8, -15};
        Integer realResult = Finder.findMin(intArray);
        Integer expectedResult = -15;
        assertEquals(expectedResult,realResult);
    }

    //Tests findMax with a null array
    @Test
    public void test_findMin2() {
        int[] intArray =  null;
        Integer realResult = Finder.findMin(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,realResult);
    }

    //Tests findMax with an empty array
    @Test
    public void test_findMin3() {
        int[] intArray =  {};
        Integer realResult = Finder.findMin(intArray);
        Integer expectedResult = null;
        assertEquals(expectedResult,realResult);
    }
}
