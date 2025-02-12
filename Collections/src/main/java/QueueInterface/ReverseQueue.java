package QueueInterface;
import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(4);
        queue.offer(8);
        queue.offer(9);

        System.out.println(queue);
        System.out.println(reverseQueue(queue));

    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
    if(queue.isEmpty()){
        return queue;
    }else {
        int front=queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
        return queue;
    }
}