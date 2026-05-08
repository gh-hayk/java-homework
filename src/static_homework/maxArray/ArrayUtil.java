package static_homework.maxArray;

//2.Create a class with a static method that accepts an array of integers and returns the index of the maximum value in the array. Use this method in another class to find the index of the maximum value in a randomly generated array of integers.
public class ArrayUtil {
    public static int maxIndex(int[] arr){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
