package QueueInterface.circularbuffersimulation;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println("Buffer after inserting 1, 2, 3 " + cb);

        cb.insert(4);
        System.out.println("Buffer after inserting 4 " + cb);

        cb.insert(5);
        System.out.println("Buffer after inserting 5  " + cb);
    }
}
