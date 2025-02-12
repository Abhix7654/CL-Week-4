package listinterface;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(2,2,8,8,4,3,9,5,3,9);
        System.out.println(removeduplicate(list));

    }

    public static LinkedHashSet<Integer> removeduplicate(List<Integer>list){
        LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
        return set;
    }
}
