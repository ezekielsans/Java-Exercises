import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {


    @Test
    public void testFindMaxOccurences() {

        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        String result = App.findMaxOccurences(input);
        assertEquals("1", result);


    }

}
