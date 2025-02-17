package Annotations.loggingmethodexecutiontime;

public class ExecutionTimeTest {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        PerformanceLogger.logExecutionTime(taskManager, "heavyTask");
        PerformanceLogger.logExecutionTime(taskManager, "lightweightTask");
        PerformanceLogger.logExecutionTime(taskManager, "normalTask");
    }
}
