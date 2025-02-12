package listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void removeDuplicateTest(){
        List<Integer> list=Arrays.asList(2,2,8,8,4,3,9,5,3,9);
        LinkedHashSet<Integer> set=new LinkedHashSet<>(list);

        assertEquals(RemoveDuplicates.removeduplicate(list),set);
    }

}