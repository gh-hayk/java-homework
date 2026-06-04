package generic_homework;

import java.util.Arrays;
import java.util.List;
/*
3.Will the following method compile? If not, why?
public static void print(List<? extends Number> list) {
 for (Number n : list)
 System.out.print(n + " ");
 System.out.println();
}
 */
public class PrintMethod {
    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(" " + n);
        }
    }

    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(2, 3, 4 ,5);
        print(i);
    }
}
