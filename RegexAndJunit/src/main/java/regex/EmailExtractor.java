package regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class EmailExtractor {
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        if (text == null) {
            return emails;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String sampleText = "Contact us at rajabhishek@example.com and muskan9334@company.org";
        List<String> emails = extractEmails(sampleText);

        for (String email : emails) {
            System.out.println("Extracted Email: " + email);
        }
    }

}
