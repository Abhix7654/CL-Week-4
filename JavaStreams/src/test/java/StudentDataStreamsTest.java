import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import storeandretrieveprimitivedata.Student;

import java.io.*;

class StudentDataStreamsTest {
    private static final String TEST_FILE = "test_students.dat";

    @BeforeEach
    void setUp() {
        Student[] students = {
                new Student(1, "Abhishek", 8.6),
                new Student(2, "Muskan", 9.9)
        };
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(TEST_FILE))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.gpa);
            }
        } catch (IOException e) {
            fail("Error setting up test file: " + e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testRetrieveStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(TEST_FILE))) {
            assertEquals(1, dis.readInt());
            assertEquals("Abhishek", dis.readUTF());
            assertEquals(8.6, dis.readDouble());

            assertEquals(2, dis.readInt());
            assertEquals("Muskan", dis.readUTF());
            assertEquals(9.9, dis.readDouble());
        } catch (IOException e) {
            fail("Error reading test file: " + e.getMessage());
        }
    }
}
