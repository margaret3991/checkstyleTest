
import static org.junit.Assert.*;
import org.junit.Test;

public class IntStackTests {

    @Test
    public void getCapacity() {
        IntStack stack = new IntStack();
        // the default capacity of the stack should be 10
        assertEquals(stack.getCapacity(), 10);
    }

    @Test
    public void checkLength() {
        IntStack stack = new IntStack();
        // stack should be empty at this point
        assertTrue(stack.isEmpty());
    }

    @Test
    public void checksetCapacity() {
        IntStack stack = new IntStack();
        stack.setCapacity(3);
        // the initial capacity  is 10, and 
        // the new capacity must be larger than the previous capacity to able to change it
        // the capacity should not be changed here
        assertEquals(stack.getCapacity(), 3);
    }

}
