package mapinterface.groupobjectsbyproperty;
public class Employee {
    public String name, department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public  String getDepartment(){
        return department;
    }
    public String toString() {
        return name;
    }
}