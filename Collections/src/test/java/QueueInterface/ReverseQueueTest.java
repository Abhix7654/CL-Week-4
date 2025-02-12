package QueueInterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {
    @Test
    void reverseQueueTest(){
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(2,3,8,9));
        Queue<Integer> answer = new LinkedList<>(Arrays.asList(9,8,3,2));

        assertEquals(ReverseQueue.reverseQueue(queue),answer);
    }

}