package regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class DateExtractor {
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        if (text == null) {
            return dates;
        }
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
         Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String sampleText = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = extractDates(sampleText);

        for (String date : dates) {
            System.out.println("Extracted Date: " + date);
        }
    }
}
