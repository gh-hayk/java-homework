package exception_homework;
import java.util.InputMismatchException;
import java.util.Scanner;
//2.Write a program that accepts an array of integers from the user and calculates the sum of its elements. If the user enters a non-integer value, the program should throw an exception and print an error message.
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();

        int[] number = new int[size];
        int sum = 0;

        try {
            for (int i = 0; i < size; i++) {
                System.out.println("enter number");
                number[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                sum += number[i];
            }
            System.out.println("sum all numbers = " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integer values!");
        }
    }
}
