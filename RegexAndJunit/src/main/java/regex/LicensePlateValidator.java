package regex;

import java.util.regex.*;

public class LicensePlateValidator {
    public static boolean isValidLicensePlate(String licensePlate) {
        if (licensePlate == null) {
            return false;
        }
       String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(licensePlate);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testPlates = {"AB1234", "A12345", "XY6789", "1234AB", "CD567"};

        for (String plate : testPlates) {
            System.out.println( plate + " - " + (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
