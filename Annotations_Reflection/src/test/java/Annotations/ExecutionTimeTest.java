package Annotations;

import Annotations.loggingmethodexecutiontime.PerformanceLogger;
import Annotations.loggingmethodexecutiontime.TaskManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExecutionTimeTest {

    @Test
    void testExecutionTimeLogging() {
        TaskManager taskManager = new TaskManager();

        PerformanceLogger.logExecutionTime(taskManager, "heavyTask");

        PerformanceLogger.logExecutionTime(taskManager, "lightweightTask");

        PerformanceLogger.logExecutionTime(taskManager, "normalTask");
    }
}
