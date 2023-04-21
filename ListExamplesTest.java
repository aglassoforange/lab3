import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;


public class ListExamplesTest {

    @Test 
	public void listTest() {
        List<String> l1 = Arrays.asList("Apple", "Pineapple", "How", "Are", "You");
        List<String> re = ListExamples.filter(l1, new HelloCheck());
        assertEquals(true, re.get(0) == "Apple");
    }


    @Test 
	public void listTest1() {
        List<String> l1 = Arrays.asList("a", "b", "c", "d");
        List<String> l2 = Arrays.asList("amy","boy");
        List<String> re = ListExamples.merge(l1, l2);
        assertEquals(true, re.get(2) == "amy");
    }

}
