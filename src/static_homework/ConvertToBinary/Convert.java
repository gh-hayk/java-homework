package static_homework.ConvertToBinary;

//Create a class with a final method that accepts an integer parameter and returns a string representation of the integer in binary format. Use this method in another class to convert a randomly generated integer to binary format.
public class Convert {
    public final String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
}
