package QueueInterface;

import QueueInterface.hospitaltriagesystem.HospitalTriageSystem;
import QueueInterface.hospitaltriagesystem.Patient;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalTriageSystemTest {
    @Test
    void hospitalTriageTest(){
        List<Patient> patients = Arrays.asList(new Patient("Abhishek", 3), new Patient("Rahul", 5), new Patient("Muskan", 2));
        List<Patient> answer = Arrays.asList(new Patient("Rahul", 5), new Patient("Abhishek", 3), new Patient("Muskan", 2));


        assertEquals(HospitalTriageSystem.processPatients(patients),answer);
    }

}