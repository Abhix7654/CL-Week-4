package setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSetToSortedListTest {
    @Test
    void setToSortedListTest(){
        HashSet<Integer> set=new HashSet<>(Arrays.asList(2,3,4,4,5,6,7,4,1,2));
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        assertEquals(ConvertSetToSortedList.setToSortedList(set),list);

    }

}