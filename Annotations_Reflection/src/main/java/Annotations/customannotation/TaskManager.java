package Annotations.customannotation;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Abhishek Kumar")
    public void completeProject() {
        System.out.println("Completing project");
    }

    @TaskInfo(assignedTo = "Priya")
    public void reviewCode() {
        System.out.println("Reviewing code");
    }

    public void generalTask() {
        System.out.println("This task has no annotation");
    }
}
