package static_homework.MaxArray;//2.Create a class with a static method that accepts an array of integers and returns the index of the maximum value in the array. Use this method in another class to find the index of the maximum value in a randomly generated array of integers.

import java.util.Random;
public class TestArrayUtil {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[5];

        for (int i = 0; i < number.length; i++){
            number[i] = random.nextInt(200);
        }
        for (int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();

        int index = ArrayUtil.maxIndex(number);
        System.out.println("max index " + index);
        System.out.println("max number " + number[index]);
    }
}
