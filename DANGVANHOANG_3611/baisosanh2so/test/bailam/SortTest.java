package bailam;

import bailam.Sort;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SortTest {

    Sort s = new Sort();

    public SortTest() {
    }

    @Test
    public void testSortDesc() {
        s.number1 = 3;
        s.number2 = 4;
        s.sortDesc();
        assertEquals(4, s.number1);
        assertEquals(3, s.number2);
    }

    @Test
    public void testComparative() {
        s.number1 = 5;
        s.number2 = 3;
        assertEquals(5, s.number1);
        assertEquals(3, s.number2);
    }

    @Test
    public void testSortAsc() {
         s.number1 = 6;
        s.number2 = 7;
        assertEquals(6, s.number1);
        assertEquals(7, s.number2);
    }

    @Test
    public void testIsEqual() {
        s.number1=10;
        s.number2=10;
        assertEquals(true, s.isEqual());
    }

}
