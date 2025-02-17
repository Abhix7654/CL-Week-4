package reflection.getclassinformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInformation {
    public static String getClassInformation(String className) {
        StringBuilder result = new StringBuilder();
        try {
            String fullClassName = "reflection.getclassinformation." + className;
            Class<?> cls = Class.forName(fullClassName);

            result.append("\nClass: ").append(cls.getName()).append("\n");

            result.append("\nMethods:\n");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                result.append(method.getName()).append("\n");
            }

            result.append("\nFields:\n");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                result.append(field.getName()).append("\n");
            }

            result.append("\nConstructors:\n");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                result.append(constructor.getName()).append("\n");
            }

        } catch (ClassNotFoundException e) {
            result.append("Class not found: ").append(className);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.next();
        System.out.println(getClassInformation(className));
    }
}
