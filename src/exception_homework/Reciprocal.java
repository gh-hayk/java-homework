package exception_homework;
//1.Write a program that reads an integer from the user and prints its reciprocal. If the user enters 0, the program should throw an exception and print an error message.
import java.util.Scanner;

public class Reciprocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number ");
        int number = scanner.nextInt();

        if (number == 0) {
            throw new ArithmeticException();
        }
        double reciprocal = 1.0 / number;
        System.out.println("reciprocal " + number + " = "+ reciprocal);
    }
}
