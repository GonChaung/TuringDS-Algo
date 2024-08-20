package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void test() {
        assertEquals(2,1+1);
    }

    @Test
    public void  testLinearSearchAverage(){
        int items[] = new int[]{1,2,3,4,5,6,7,9};
        Searchable arr = new LinearSearch(items);
        int index = arr.findItem(4);
        assertEquals(3,index);
    }
}
