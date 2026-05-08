package static_homework.math;
//7.Create a class with a static method that recursively calculates the factorial of a given integer. Use this method in another class to calculate the factorial of a randomly generated integer.
public class MathUtil {
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
