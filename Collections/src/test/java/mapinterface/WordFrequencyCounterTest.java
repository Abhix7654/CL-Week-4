package mapinterface;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testWordFrequency() {
        String text = "Hello world, hello Java!";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertEquals(Map.of("hello", 2, "world", 1, "java", 1), result);
    }

    @Test
    void testEmptyString() {
        String text = "";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSpecialCharacters() {
        String text = "Hi!! Hi??";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertEquals(Map.of("hi", 2), result);
    }
}
