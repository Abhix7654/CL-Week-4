import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinallyExampleTest {

    @Test
    void testValidDivision() {
        assertEquals(5, FinallyExample.divideNumbers(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(0, FinallyExample.divideNumbers(10, 0));
    }
}
