package reflection.accessprivatefield;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Abhishek";
        this.age = 22;
    }
    public void displaydetail() {
        System.out.println("Name: " + name+" Age: " + age);
    }
}
