package setinterface;
import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,8));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,8));

        System.out.println(symmetricDifference(set1,set2));

    }
    public static Set<Integer> symmetricDifference(HashSet<Integer> set1,HashSet<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);

        result.removeAll(temp);

        return result;

    }

}
