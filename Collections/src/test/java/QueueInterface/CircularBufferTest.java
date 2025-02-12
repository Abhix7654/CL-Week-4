package QueueInterface;

import QueueInterface.circularbuffersimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class CircularBufferTest {

    @Test
    void testCircularBufferOperations() {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        assertArrayEquals(new int[]{1, 2, 3}, cb.getBuffer());

        cb.insert(4);
        assertArrayEquals(new int[]{2, 3, 4}, cb.getBuffer());

        cb.insert(5);
        assertArrayEquals(new int[]{3, 4, 5}, cb.getBuffer());

        cb.insert(6);
        assertArrayEquals(new int[]{4, 5, 6}, cb.getBuffer());
    }

}
