package listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class NthElementFromEndTest {
    @Test
    void nthElementTest(){
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        String ans="D";

        assertEquals(NthElementFromEnd.findNthFromEnd(linkedList,2),ans);
    }

}