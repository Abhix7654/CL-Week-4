package regex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HexColorValidatorTest {

    @Test
    public void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#AABBCC"));
        assertTrue(HexColorValidator.isValidHexColor("#000000"));
        assertTrue(HexColorValidator.isValidHexColor("#FFFFFF"));
    }

    @Test
    public void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123"));
        assertFalse(HexColorValidator.isValidHexColor("#GHIJKL"));
        assertFalse(HexColorValidator.isValidHexColor("FFA500"));
        assertFalse(HexColorValidator.isValidHexColor("#12345G"));
        assertFalse(HexColorValidator.isValidHexColor(null));
        assertFalse(HexColorValidator.isValidHexColor(""));
    }
}
