package reflection.accessprivatefield;
import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Class<?> cls = person.getClass();

        Field field1 = cls.getDeclaredField("name");
        Field field2 = cls.getDeclaredField("age");

        field1.setAccessible(true);
        field2.setAccessible(true);

        System.out.println("Original Name: " + field1.get(person));
        System.out.println("Original Age: " + field2.get(person));

        field1.set(person, "Muskan");
        field2.set(person, 21);

        System.out.println("Modified Name: " + field1.get(person));
        System.out.println("Modified Age: " + field2.get(person));

        person.displaydetail();
    }
}
