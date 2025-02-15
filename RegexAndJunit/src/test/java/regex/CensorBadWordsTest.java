package regex;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensorBadWordsTest {

    @Test
    public void testCensorBadWords() {
        List<String> badWords = List.of("damn", "stupid");
        assertEquals("This is a **** bad example with some **** words.",
                CensorBadWords.censorText("This is a damn bad example with some stupid words.", badWords));
    }

    @Test
    public void testCensorWithNoBadWords() {
        List<String> badWords = List.of("badword");
        assertEquals("This is a clean sentence.",
                CensorBadWords.censorText("This is a clean sentence.", badWords));
    }

    @Test
    public void testCensorWithEmptyString() {
        List<String> badWords = List.of("damn");
        assertEquals("", CensorBadWords.censorText("", badWords));
    }

}
