import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

public class TryWithResourcesTest {

    private static final String TEST_FILE = "test_info.txt";

    @Test
    void testReadFirstLine() throws IOException {
        Files.write(Paths.get(TEST_FILE), "Hello, World!\nSecond line".getBytes());

        String firstLine = TryWithResources.readFirstLine(TEST_FILE);
        assertEquals("Hello, World!", firstLine);

        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testFileNotFound() {
        String firstLine = TryWithResources.readFirstLine("non_existent.txt");
        assertNull(firstLine);
    }
}
