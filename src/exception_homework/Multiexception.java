package exception_homework;
//6.Create three new types of exceptions. Write a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
// parent Exception
class AppException extends Exception {
    public AppException(String message) {
        super(message);
    }
}

//3 child Exception
class DatabaseException extends AppException {
    public DatabaseException(String message) {
        super("DatabaseException: " + message);
    }
}

class NetworkException extends AppException {
    public NetworkException(String message) {
        super("NetworkException: " + message);
    }
}

class ValidationException extends AppException {
    public ValidationException(String message) {
        super("ValidationException: " + message);
    }
}

public class Multiexception {
    public static void riskyMethod(int choice) throws DatabaseException,
            NetworkException,
            ValidationException {
        if (choice == 1) {
            throw new DatabaseException("Could not connect to database!");
        } else if (choice == 2) {
            throw new NetworkException("No internet connection!");
        } else {
            throw new ValidationException("Invalid input data!");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            try {
                riskyMethod(i);
            } catch (AppException e) {
                System.out.println("Caught: " + e.getMessage());
            }
        }
        System.out.println("Program finished.");
    }

}
