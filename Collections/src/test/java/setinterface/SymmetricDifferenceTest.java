package setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {
    @Test
    void symmetricDiff(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,8));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,8));

        HashSet<Integer> ans= new HashSet<>(Arrays.asList(1,2,4,5));
        assertEquals(SymmetricDifference.symmetricDifference(set1,set2),ans);
    }

}