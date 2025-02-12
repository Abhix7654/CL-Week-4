package setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {
    @Test
    void unionTest(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        HashSet<Integer> ans=new HashSet<>(Arrays.asList(1,2,3,4,5));

        assertEquals(UnionAndIntersection.union(set1,set2),ans);

    }
    @Test
    void intersectionTest(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        ArrayList<Integer> ans=new ArrayList<>(Arrays.asList(3));

        assertEquals(UnionAndIntersection.interSection(set1,set2),ans);

    }

}