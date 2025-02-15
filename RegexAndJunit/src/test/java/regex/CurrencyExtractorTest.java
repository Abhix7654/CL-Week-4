package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CurrencyExtractorTest {

    @Test
    public void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50. Another item costs $100.00 and 5.75.";
        List<String> extractedValues = CurrencyExtractor.extractCurrencyValues(text);

        List<String> expectedValues = List.of("$45.99", "10.50", "$100.00", "5.75");
        assertEquals(expectedValues, extractedValues);
    }

    @Test
    public void testNoCurrencyValues() {
        String text = "There are no prices mentioned here.";
        List<String> extractedValues = CurrencyExtractor.extractCurrencyValues(text);
        assertTrue(extractedValues.isEmpty());
    }
    
}
