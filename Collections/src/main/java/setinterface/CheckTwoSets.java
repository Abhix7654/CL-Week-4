package setinterface;
import java.util.*;


public class CheckTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(3,4,5,6));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,5,4,4,6));

        System.out.println(areSetsEqual(set1,set2));

    }
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}
