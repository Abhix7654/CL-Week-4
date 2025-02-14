import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UncheckedExceptionTest {

    @Test
    void testValidDivision() {
        assertEquals(5, UncheckedException.divideNumbers(10, 2));
        assertEquals(-3, UncheckedException.divideNumbers(-9, 3));
        assertEquals(0, UncheckedException.divideNumbers(0, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            UncheckedException.divideNumbers(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
