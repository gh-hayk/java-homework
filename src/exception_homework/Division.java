package exception_homework;
//3.Write a program that reads two numbers from the user and divides them. If the user enters 0 as the second number, the program should throw an exception and print an error message.

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        double first = scanner.nextDouble();

        System.out.println("enter second number");
        double second = scanner.nextDouble();

        if (second == 0) {
            throw new ArithmeticException("Error cannot divide by zero");
        }

        double division = first / second;
        System.out.println(first + " / " + second + " = " + division);
    }
}
