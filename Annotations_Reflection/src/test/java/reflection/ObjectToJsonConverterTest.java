package reflection;


import org.junit.jupiter.api.Test;
import reflection.generatejsonrepresentation.ObjectToJsonConverter;
import reflection.generatejsonrepresentation.Person;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectToJsonConverterTest {

    @Test
    public void testToJson() {
        Person person = new Person("Abhishek", 22, false);
        String json = ObjectToJsonConverter.toJson(person);

        assertTrue(json.contains("\"name\":\"Abhishek\""));
        assertTrue(json.contains("\"age\":22"));
        assertTrue(json.contains("\"isStudent\":false"));
    }
}
