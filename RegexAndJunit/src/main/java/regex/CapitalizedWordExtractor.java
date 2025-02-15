package regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordExtractor {
    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        if (text == null) {
            return words;
        }
        String regex = "\\b[A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String sampleText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = extractCapitalizedWords(sampleText);

        for (String word : words) {
            System.out.println("Extracted Word " + word);
        }
    }
}
