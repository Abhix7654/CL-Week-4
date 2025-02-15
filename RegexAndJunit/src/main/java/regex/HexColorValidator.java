package regex;

import java.util.regex.*;

public class HexColorValidator {

    public static boolean isValidHexColor(String hexColor) {
        if (hexColor == null) {
            return false;
        }
        String regex = "^#[0-9A-Fa-f]{6}$";
       Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexColor);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testColors = {"#FFA500", "#ff4500", "#123", "#AABBCC", "#GHIJKL"};

        for (String color : testColors) {
            System.out.println(color + " - " + (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
