import customexception.CustomExceptionExample;
import customexception.InvalidAgeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomExceptionExampleTest {

    @Test
    void testValidAge() {
        assertDoesNotThrow(() -> CustomExceptionExample.validateAge(18));
        assertDoesNotThrow(() -> CustomExceptionExample.validateAge(25));
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            CustomExceptionExample.validateAge(16);
        });
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}
