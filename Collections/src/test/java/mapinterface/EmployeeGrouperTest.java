package mapinterface;

import mapinterface.groupobjectsbyproperty.Employee;
import mapinterface.groupobjectsbyproperty.EmployeeGrouper;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"), new Employee("Carol", "HR"));

        Map<String, List<Employee>> expected = new HashMap<>();

        expected.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expected.put("IT", Arrays.asList(new Employee("Bob", "IT")));

        Map<String, List<Employee>> result = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(2, result.get("HR").size());
        assertEquals(1, result.get("IT").size());

    }
}
