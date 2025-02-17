package Annotations;

import Annotations.customcachingsystem.CacheHandler;
import Annotations.customcachingsystem.ExpensiveComputation;
import Annotations.customcachingsystem.ExpensiveComputationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheExampleTest {

    @Test
    void testCaching() {
        ExpensiveComputation computation = CacheHandler.createCachedInstance(
                new ExpensiveComputationImpl(), ExpensiveComputation.class
        );

        long result1 = computation.factorial(5);
        long result2 = computation.factorial(5);

        assertEquals(result1, result2);
    }

}