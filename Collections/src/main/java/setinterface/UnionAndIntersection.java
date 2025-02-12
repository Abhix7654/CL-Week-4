package setinterface;
import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println(union(set1,set2));
        System.out.println(interSection(set1,set2));

    }

    public static HashSet<Integer> union(HashSet<Integer> set1,HashSet<Integer> set2){
        HashSet<Integer> set=new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);

        return set;
    }

    public static ArrayList<Integer> interSection(HashSet<Integer> set1,HashSet<Integer> set2){
        ArrayList<Integer> list=new ArrayList<>();

        for (int i:set1){
            if(set2.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
