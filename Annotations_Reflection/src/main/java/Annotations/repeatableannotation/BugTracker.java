package Annotations.repeatableannotation;

public class BugTracker {

    @BugReport(description = "NullPointerException occurs on invalid input", reportedBy = "Abhishek")
    @BugReport(description = "Performance issue when handling large data sets", reportedBy = "Muskan")
    public void process() {
        System.out.println("Processing data");
    }
}
