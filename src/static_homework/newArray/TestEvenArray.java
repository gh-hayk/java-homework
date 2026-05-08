package static_homework.newArray;
//9.Create a class with a static method that accepts an array of integers and returns a new array containing only the even numbers. Use this method in another class to filter out the even numbers in a randomly generated array of integers.

import java.util.Random;

public class TestEvenArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.print("all number ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] evens = EvenArray.filterEven(numbers);

        System.out.print("even numbers ");
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}
