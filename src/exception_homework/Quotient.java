package exception_homework;
//9.Write a program that reads two integers from the user and calculates their quotient. If the second integer is 0 or negative, the program should throw an exception and print an error message.

import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidDivisorException extends Exception {
    public InvalidDivisorException(String message) {
        super(message);
    }
}

public class Quotient {
    public static double divide(int a, int b) throws InvalidDivisorException {
        if (b == 0) {
            throw new InvalidDivisorException("Divisor cannot be zero!");
        }
        if (b < 0) {
            throw new InvalidDivisorException("Divisor cannot be negative: " + b);
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int first = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            double result = divide(first, second);
            System.out.println(first + " / " + second + " = " + result);

        } catch (InvalidDivisorException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integer values!");

        } finally {
            System.out.println("Good bye!");
            scanner.close();
        }
    }
}
