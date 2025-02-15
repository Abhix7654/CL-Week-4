package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SpaceReplacerTest {

    @Test
    public void testReplaceMultipleSpaces() {
        assertEquals("This is an example with multiple spaces.",
                SpaceReplacer.replaceMultipleSpaces("This   is  an   example  with   multiple     spaces."));
    }

    @Test
    public void testReplaceLeadingTrailingSpaces() {
        assertEquals("Hello World!", SpaceReplacer.replaceMultipleSpaces("   Hello     World!    "));
    }

    @Test
    public void testReplaceSingleSpace() {
        assertEquals("Java is fun!", SpaceReplacer.replaceMultipleSpaces("Java is fun!"));
    }

    @Test
    public void testReplaceEmptyString() {
        assertEquals("", SpaceReplacer.replaceMultipleSpaces(""));
    }


}
