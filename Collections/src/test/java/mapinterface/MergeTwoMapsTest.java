package mapinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoMapsTest {
      @Test
        void testMergeMaps() {
            Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
            Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

            Map<String, Integer> expected = new HashMap<>();
            expected.put("A", 1);
            expected.put("B", 5);
            expected.put("C", 4);

            Map<String, Integer> result = MergeTwoMaps.mergeMaps(map1, map2);
            assertEquals(expected, result);
        }

}