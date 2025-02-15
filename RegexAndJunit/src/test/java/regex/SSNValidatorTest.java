package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SSNValidatorTest {

    @Test
    public void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("My SSN is 123-45-6789."));
        assertTrue(SSNValidator.isValidSSN("987-65-4321"));
    }

    @Test
    public void testInvalidSSN() {
        assertFalse(SSNValidator.isValidSSN("123456789"));
        assertFalse(SSNValidator.isValidSSN("12-345-6789"));
        assertFalse(SSNValidator.isValidSSN("123-456-789"));
        assertFalse(SSNValidator.isValidSSN("ABC-DE-FGHI"));
        assertFalse(SSNValidator.isValidSSN(null));
    }
}
