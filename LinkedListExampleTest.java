
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class LinkedListExampleTest {
    @Test 
	public void listTest() {
        LinkedList ll = new LinkedList();
        assertEquals(true, ll.first() == null);

    }

    
}
