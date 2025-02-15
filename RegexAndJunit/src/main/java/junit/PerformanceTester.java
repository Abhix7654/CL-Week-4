package junit;

public class PerformanceTester {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        String result = PerformanceTester.longRunningTask();
        System.out.println("Result: " + result);
    }
}
