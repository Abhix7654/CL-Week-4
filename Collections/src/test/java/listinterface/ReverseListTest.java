package listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    @Test
    public void testReverseArrayList() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(3);
        answer.add(2);
        answer.add(1);

        assertEquals(ReverseList.reversedArrayList(input),answer);

}
    @Test
    public void testReverseLinkedList() {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        LinkedList<Integer> answer = new LinkedList<>();
        answer.add(3);
        answer.add(2);
        answer.add(1);

        assertEquals(ReverseList.reversedLinkedList(input),answer);

    }
}