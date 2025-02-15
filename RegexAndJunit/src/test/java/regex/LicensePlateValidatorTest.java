package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LicensePlateValidatorTest {

    @Test
    public void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY6789"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("CD5678"));
    }

    @Test
    public void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("1234AB"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("CD567"));
        assertFalse(LicensePlateValidator.isValidLicensePlate("ab1234"));
        assertFalse(LicensePlateValidator.isValidLicensePlate(""));
        assertFalse(LicensePlateValidator.isValidLicensePlate(null));
    }
}
