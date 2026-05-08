package exception_homework;
//7.Write a program that prompts the user to enter their age. If the user enters an age that is negative or greater than 120, the program should throw an exception and print an error message.

import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Agevalidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        if (age > 120) {
            throw new InvalidAgeException("Age cannot be greater than 120: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer!");

        } finally {
            System.out.println("Good bye!");
            scanner.close();
        }
    }
}
