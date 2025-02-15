package regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class LinkExtractor {
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        if (text == null) {
            return links;
        }
        String regex = "\\bhttps?://[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}\\b*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String sampleText = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = extractLinks(sampleText);

        for (String link : links) {
            System.out.println("Extracted Link: " + link);
        }
    }
}
