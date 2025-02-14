import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {

    @Test
    void testValidInterestCalculation() {
        double interest = InterestCalculator.calculateInterest(1000, 5, 2);
        assertEquals(100.0, interest);
    }

    @Test
    void testNegativeAmountThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(-500, 5, 2);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testNegativeRateThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(1000, -3, 2);
        });
        assertEquals("Invalid input: Amount and rate must be positive", exception.getMessage());
    }
}
