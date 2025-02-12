package mapinterface.groupobjectsbyproperty;
import java.util.*;
import java.util.stream.Collectors;


public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedByDepartment = new HashMap<>();

        for (Employee emp : employees) {
            groupedByDepartment.computeIfAbsent(emp.getDepartment(), k-> new ArrayList<>()).add(emp);
        }

        return groupedByDepartment;

    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"), new Employee("Carol", "HR"));
        System.out.println(groupByDepartment(employees));
    }
}