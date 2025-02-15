package junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManager {

    public static void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    public static void removeElement(List<Integer> list, int element) {
        if (list != null) {
            list.remove(Integer.valueOf(element));
        }
    }

    public static int getSize(List<Integer> list) {
        return (list != null) ? list.size() : 0;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(34);

        addElement(list,9);
        System.out.println(list);
        removeElement(list,9);
        System.out.println(list);
        System.out.println(getSize(list));
    }
}
