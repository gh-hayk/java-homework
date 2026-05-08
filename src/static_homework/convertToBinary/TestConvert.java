package static_homework.convertToBinary;
//8.Create a class with a final method that accepts an integer parameter and returns a string representation of the integer in binary format. Use this method in another class to convert a randomly generated integer to binary format.

import java.util.Random;

public class TestConvert {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Convert convert = new Convert();

        System.out.println("Number " + number);
        System.out.println("Number to Binary " + convert.toBinary(number));
    }
}
