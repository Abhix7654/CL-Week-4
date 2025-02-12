package setinterface;
import java.util.*;

public class FindSubsets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5));

        System.out.println(findSubset(set1,set2));

    }

    public static Boolean findSubset(Set<Integer> set1,Set<Integer> set2) {
        return set2.containsAll(set1) || set1.containsAll(set2);
    }
}
