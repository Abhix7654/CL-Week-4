package listinterface;
import java.util.*;

public class RotateElements {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(2,3,4,5,6,7,8,9);

        System.out.println(rotateList(list,12));

    }
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
         //For out of bound
        positions=positions%size;
        List<Integer> rotated = new ArrayList<>(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }
}
