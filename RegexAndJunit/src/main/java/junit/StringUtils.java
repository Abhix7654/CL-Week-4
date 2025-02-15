package junit;

public class StringUtils {
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str="he is good is he";
        System.out.println(reverse(str));
        System.out.println(isPalindrome(str));
        System.out.println(toUpperCase(str));
    }
}
