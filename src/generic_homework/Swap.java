package generic_homework;
/*
1.Write a generic method to exchange the positions of two different elements in an array.
 */
import java.util.Arrays;

public class Swap {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("before swap " + Arrays.toString(numbers));

        swap(numbers, 0, 4);
        System.out.println("after swap" + Arrays.toString(numbers));

        System.out.println();

        String[] words = {"Hello", "World"};
        System.out.println("before swap " + Arrays.toString(words));

        swap(words, 1, 0);
        System.out.println("after swap" + Arrays.toString(words));
    }
}
