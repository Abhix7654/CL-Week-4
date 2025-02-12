package listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RotateElementsTest {
    @Test
    void rotateListTest(){
        List<Integer>list=Arrays.asList(2,3,4,5,6,7,8);
        int position=3;
        List<Integer>answer=Arrays.asList(5,6,7,8,2,3,4);
        assertEquals(RotateElements.rotateList(list,position),answer);

    }

}