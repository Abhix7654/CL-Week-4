package regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExtractor {
    public static List<String> extractProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        if (text == null) {
            return languages;
        }
        String regex = "\\b(JavaScript|Java|Python|Go|Swift|Ruby|Kotlin|PHP|TypeScript|Rust|Perl|R|Scala)\\b|(?<=\\s|^)(C\\+\\+|C)(?=\\s|$)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String sampleText = "I love Java, Python, C and JavaScript, but I haven't C++ tried Go yet.";
        List<String> extractedLanguages = extractProgrammingLanguages(sampleText);

        System.out.println("Extracted Programming Languages: " + extractedLanguages);
    }
}
