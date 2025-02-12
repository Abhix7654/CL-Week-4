package QueueInterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryNumbersTest {
    @Test
    void generateBinaryNumbersTest(){
        int n=5;
        List<String>list=new ArrayList<>(Arrays.asList("1","10","11","100","101"));
        assertEquals(GenerateBinaryNumbers.generateBinaryNumbers(n),list);
    }

}