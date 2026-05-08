package exception_homework;
//8.Write a program that reads a string from the user and checks if it is a valid email address. If the string is not a valid email address, the program should throw an exception and print an error message.

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Emailvalidator {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Missing '@' symbol: " + email);
        }

        int atIndex = email.indexOf("@");

        if (atIndex == 0) {
            throw new InvalidEmailException("Missing username before '@': " + email);
        }

        String afterAt = email.substring(atIndex);
        if (!afterAt.contains(".")) {
            throw new InvalidEmailException("Missing '.' after '@': " + email);
        }

        if (email.endsWith(".")) {
            throw new InvalidEmailException("Email cannot end with '.': " + email);
        }

        System.out.println("Valid email: " + email);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            validateEmail(email);

        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Good bye!");
            scanner.close();
        }
    }
}
