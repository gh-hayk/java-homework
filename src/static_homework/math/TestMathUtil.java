package static_homework.math;
//7.Create a class with a static method that recursively calculates the factorial of a given integer. Use this method in another class to calculate the factorial of a randomly generated integer.
import java.util.Random;

public class TestMathUtil {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.print("number = " + "!" + number + " = ");
        int result = MathUtil.factorial(number);

        System.out.println(result +" (factorial)");
    }
}
