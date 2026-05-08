package static_homework.numberGame;
//3.Create a class with a static field that is initialized with a random value between 1 and 100. Write a program that allows the user to guess the value of the field. The program should provide feedback to the user indicating whether the guess is too high, too low, or correct.
import java.util.Random;

public class secretNumber {
    public static int value = new Random().nextInt(100) + 1;
}
