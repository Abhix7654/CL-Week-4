package regex;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkExtractorTest {

    @Test
    public void testExtractLinks_ValidLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> expected = Arrays.asList("https://www.google.com", "http://example.org");
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }

    @Test
    public void testExtractLinks_EmptyString() {
        String text = "";
        List<String> expected = Arrays.asList();
        assertEquals(expected, LinkExtractor.extractLinks(text));
    }


}
