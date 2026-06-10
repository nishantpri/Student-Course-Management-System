package learnermanagement.util;

public class InputValidator {
    public static boolean isNullOrEmpty(String value) {
            return value == null || value.trim().isEmpty();
    }

    public static boolean isValidEmail(String email) {
            return email != null && email.contains("@");
    }

}
