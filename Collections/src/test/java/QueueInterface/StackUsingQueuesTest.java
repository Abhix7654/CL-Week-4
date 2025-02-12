package QueueInterface;

import QueueInterface.implementstackusingqueues.StackUsingQueues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {
    @Test
    void testStackOperations() {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.top());

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());

        assertFalse(stack.isEmpty());

        assertEquals(1, stack.pop());

        assertTrue(stack.isEmpty());

        Exception exception = assertThrows(RuntimeException.class, stack::pop);
        assertEquals("Stack is empty!", exception.getMessage());

        exception = assertThrows(RuntimeException.class, stack::top);
        assertEquals("Stack is empty!", exception.getMessage());
    }

}