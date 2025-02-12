package QueueInterface.hospitaltriagesystem;
import java.util.Objects;

public class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity " + severity + ")";
    }
    @Override
    public boolean equals(Object obj) {
        Patient patient = (Patient) obj;
       return severity == patient.severity && Objects.equals(name, patient.name);
    }

}