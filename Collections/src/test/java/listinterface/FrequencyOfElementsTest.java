package listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyOfElementsTest {
    @Test
    public void testCountFrequency() {
        List<String> list=Arrays.asList("Abhishek","Palak","Naincy","Abhishek","Rahul","Palak","Palak");

       Map<String,Integer> expected=FrequencyOfElements.countFrequency(list);

        assertEquals(FrequencyOfElements.countFrequency(list),expected);
    }

}