package reflection;
import org.junit.jupiter.api.Test;
import reflection.customobjectmapper.CustomObjectMapper;
import reflection.customobjectmapper.Person;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CustomObjectMapperTest {
    private Object getFieldValue(Object obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void testToObject() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Abhishek");
        properties.put("age", 30);
        properties.put("city", "Bhopal");

        Person person = CustomObjectMapper.toObject(Person.class, properties);

        assertNotNull(person);
        assertEquals("Abhishek", getFieldValue(person, "name"));
        assertEquals(30, getFieldValue(person, "age"));
        assertEquals("Bhopal", getFieldValue(person, "city"));
    }


}
