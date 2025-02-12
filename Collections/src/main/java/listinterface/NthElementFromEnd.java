package listinterface;
import java.util.*;

public class NthElementFromEnd {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(findNthFromEnd(linkedList,2));

    }
    public static String findNthFromEnd(LinkedList<String> list, int n) {

      Collections.reverse(list);
      return list.get(n-1);

    }
}
