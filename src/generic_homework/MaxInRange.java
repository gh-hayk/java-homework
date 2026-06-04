package generic_homework;

import java.util.Arrays;
import java.util.List;
/*
4.Write a generic method to find the maximal element in the range [begin, end) of a list.
 */
public class MaxInRange {
    public static <T extends Comparable<T>> T max(List<T> list, int begin, int end) {
        if (begin < 0 || end > list.size() || begin >= end) {
        }
        T maxVal = list.get(begin);

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i).compareTo(maxVal) > 0) {
                maxVal = list.get(i);
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 9, 5, 4, 7, 10);

        System.out.println(max(numbers,2,8));
    }
}
