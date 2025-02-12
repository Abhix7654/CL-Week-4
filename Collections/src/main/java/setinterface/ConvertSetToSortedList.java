package setinterface;
import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(Arrays.asList(2,3,4,4,5,6,7,4,1,2));
        System.out.println(setToSortedList(set));

    }
    public static ArrayList<Integer> setToSortedList(HashSet<Integer> set){
        return new ArrayList<>(new TreeSet<>(set));
    }
}
