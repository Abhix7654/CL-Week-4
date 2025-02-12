package QueueInterface.hospitaltriagesystem;
import java.util.*;



public class HospitalTriageSystem {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(new Patient("Abhishek", 3), new Patient("Rahul", 5), new Patient("Muskan", 2));

        System.out.println(processPatients(patients));

    }

    public static List<Patient> processPatients(List<Patient> patients) {
        List<Patient> list = new ArrayList<>();
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        // Add patients to the queue
        triageQueue.addAll(patients);

        // Processing patients

        while (!triageQueue.isEmpty()) {
            list.add(triageQueue.poll());
        }

        return list;
    }
}
