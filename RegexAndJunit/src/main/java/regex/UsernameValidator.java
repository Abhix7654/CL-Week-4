package regex;
import java.util.regex.*;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us", "Valid_User", "valid12345"};

        for (String username : testUsernames) {
            System.out.println( username + " - " + (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}


