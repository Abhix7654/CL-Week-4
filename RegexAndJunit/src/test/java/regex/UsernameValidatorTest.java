package regex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsernameValidatorTest {

    @Test
    public void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("Valid_User"));
        assertTrue(UsernameValidator.isValidUsername("valid12345"));
    }

    @Test
    public void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user"));
        assertFalse(UsernameValidator.isValidUsername("us"));
        assertFalse(UsernameValidator.isValidUsername("veryverylongusername"));
        assertFalse(UsernameValidator.isValidUsername("user@name"));
        assertFalse(UsernameValidator.isValidUsername(""));
        assertFalse(UsernameValidator.isValidUsername(null));
    }
}
