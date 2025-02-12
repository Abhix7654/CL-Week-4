package mapinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapInverterTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> expected = Map.of(1, Arrays.asList("C", "A"), 2, Arrays.asList("B"));

        assertEquals(expected, MapInverter.invertMap(input));
    }

    @Test
    void testEmptyMap() {
        assertTrue(MapInverter.invertMap(new HashMap<>()).isEmpty());
    }
}
