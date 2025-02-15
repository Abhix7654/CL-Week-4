package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class RepeatingWordFinderTest {

    @Test
    public void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> result = RepeatingWordFinder.findRepeatingWords(text);

        Set<String> expected = Set.of("is", "repeated");

        assertEquals(expected, result);
    }

    @Test
    public void testNoRepeatingWords() {
        String text = "Hello world, this is a test.";
        Set<String> result = RepeatingWordFinder.findRepeatingWords(text);

        assertTrue(result.isEmpty());
    }


}
