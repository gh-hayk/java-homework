package exception_homework;
//5.Write a program that reads an integer number and  calculates and prints its square root. If the number is  invalid or negative, print "Invalid number". In all  cases finally print "Good bye". Use try-catch-finally.
import java.util.Scanner;
import java.util.InputMismatchException;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new ArithmeticException("Negative number!");
            }

            double result = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid number");

        } catch (ArithmeticException e) {
            System.out.println("Invalid number");

        } finally {
            System.out.println("Good bye");
            scanner.close();
        }
    }
}
