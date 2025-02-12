package setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {
    @Test
    void findSubsetTest(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5));

        boolean ans=true;

        assertEquals(FindSubsets.findSubset(set1,set2),ans);
    }

}