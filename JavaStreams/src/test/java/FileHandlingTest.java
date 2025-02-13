import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.*;

class FileHandlerTest {

    private static final String TEST_SOURCE_FILE = "examplefile.txt";
    private static final String TEST_DEST_FILE = "Output.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(TEST_SOURCE_FILE)) {
            fos.write("Testing exception handling!".getBytes());
        }
    }

    @Test
    void testReadFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> FileHandling.readFile(TEST_SOURCE_FILE));
    }

    @Test
    void testReadFile_NonExistentFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> FileHandling.readFile("non_existing.txt"));
    }

    @Test
    void testWriteFile_DoesNotThrowException() {
        assertDoesNotThrow(() -> FileHandling.writeFile(TEST_DEST_FILE, "Test content"));
    }

    @Test
    void testWriteFile_NullContent_DoesNotThrowException() {
        assertDoesNotThrow(() -> FileHandling.writeFile(TEST_DEST_FILE, null));
    }

    @AfterEach
    void tearDown() {
        new File(TEST_SOURCE_FILE).delete();
        new File(TEST_DEST_FILE).delete();
    }
}
