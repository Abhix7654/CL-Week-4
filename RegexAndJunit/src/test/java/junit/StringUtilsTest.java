package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("madam", StringUtils.reverse("madam"));

    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("Level"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("WORLD", StringUtils.toUpperCase("world"));
        assertEquals("", StringUtils.toUpperCase(""));
    }
}
