package static_homework.numberGame;
//3.Create a class with a static field that is initialized with a random value between 1 and 100. Write a program that allows the user to guess the value of the field. The program should provide feedback to the user indicating whether the guess is too high, too low, or correct.
import java.util.Scanner;

public class testSecretNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess the number from 1 to 100!");

        while (guess != secretNumber.value) {
            System.out.println("your guess ");
            guess = scanner.nextInt();

            if (guess > secretNumber.value) {
                System.out.println("too high");
            } else if (guess < secretNumber.value) {
                System.out.println("too low");
            } else {
                System.out.println("you are right");
            }
        }
    }
}
