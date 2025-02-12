package mapinterface;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
class KeyWithHighestValueTest {
    @Test
       void testFindMaxKey() {
            Map<String, Integer> input = Map.of("A", 10, "B", 20, "C", 15);
            assertEquals("B", KeyWithHighestValue.findMaxKey(input));
        }
    }


