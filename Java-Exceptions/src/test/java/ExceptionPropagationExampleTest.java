import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationExampleTest {

    @Test
    void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {ExceptionPropagationExample.method1();});

        assertEquals("/ by zero", exception.getMessage());
    }
}
