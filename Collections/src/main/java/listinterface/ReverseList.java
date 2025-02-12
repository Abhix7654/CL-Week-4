package listinterface;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i=0;i<=6;i++){
            arrayList.add(i);
        }

        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i=0;i<=6;i++){
            linkedList.add(i);
        }

        System.out.println("Reversed ArrayList "+reversedArrayList(arrayList) );
        System.out.println("Reversed LinkedList "+reversedLinkedList(linkedList) );

    }
    public static ArrayList<Integer> reversedArrayList(ArrayList<Integer> list) {
            ArrayList<Integer> reversed = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                reversed.add(list.get(i));
            }
            return reversed;
        }

    public static LinkedList<Integer> reversedLinkedList(List<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

}
