package generic_homework;

public final class Algorithm {
/*
2.Will the following class compile? If not, why?
Not but generic can't working primitive type

    public static <T> T max(T x, T y) {
        return x > y ? x : y;
        }
 */

    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;

    }

    public static void main(String[] args) {
        System.out.println(max(7, 2));
    }

}
