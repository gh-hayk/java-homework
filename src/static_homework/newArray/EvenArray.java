package static_homework.newArray;
//9.Create a class with a static method that accepts an array of integers and returns a new array containing only the even numbers. Use this method in another class to filter out the even numbers in a randomly generated array of integers.
public class EvenArray {
    public static int[] filterEven(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index = index + 1;
            }
        }
        return result;
    }
}
