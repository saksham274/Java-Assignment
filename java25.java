 // Custom Exception for Invalid Username
 class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Password
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class java25 {

    // Method to validate username and password
    public static void validate(String username, String password, String confirmPassword ) 
            throws InvalidUsernameException, InvalidPasswordException {
        
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        if (!password.equals(confirmPassword)) {
            throw new InvalidPasswordException("Passwords do not match.");
        }
        System.out.println("Username and password are valid.");
    }
    public static void main(String[] args) {
        // Example username and passwords
        String username = "user12";  // Modify for testing
        String password = "pass123";  // Modify for testing
        String confirmPassword = "pass123";  // Modify for testing

        try {
            validate(username, password, confirmPassword);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

