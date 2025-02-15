package regex;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgrammingLanguageExtractorTest {

    @Test
    public void testExtractLanguages() {
        assertEquals(List.of("Java", "Python", "JavaScript", "Go"),
                ProgrammingLanguageExtractor.extractProgrammingLanguages("I love Java, Python, and JavaScript, but I haven't tried Go yet."));

        assertEquals(List.of("C", "C++", "Swift"),
                ProgrammingLanguageExtractor.extractProgrammingLanguages("C and C++ are powerful, and Swift is great for iOS development."));

        assertEquals(List.of("Rust", "Kotlin", "TypeScript","JavaScript"),
                ProgrammingLanguageExtractor.extractProgrammingLanguages("Rust is memory safe, Kotlin is for Android, and TypeScript is JavaScript with types."));
    }

    @Test
    public void testNoProgrammingLanguages() {
        assertTrue(ProgrammingLanguageExtractor.extractProgrammingLanguages("This sentence has no programming languages.").isEmpty());
    }

    @Test
    public void testNullAndEmptyInputs() {
        assertTrue(ProgrammingLanguageExtractor.extractProgrammingLanguages(null).isEmpty());
        assertTrue(ProgrammingLanguageExtractor.extractProgrammingLanguages("").isEmpty());
        assertTrue(ProgrammingLanguageExtractor.extractProgrammingLanguages("    ").isEmpty());
    }
}
