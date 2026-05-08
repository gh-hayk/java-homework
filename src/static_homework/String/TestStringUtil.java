package static_homework.String;

//6.Create a class with a static method that accepts two strings and returns a string that contains all the characters that appear in both strings. Use this method in another class to find the common characters in two randomly generated strings.
public class TestStringUtil {
    public static void main(String[] args) {
        String first = "hello";
        String second = "world";

        System.out.println("First String = " + first);
        System.out.println("Second String = " + second);

        String common = StringUtil.findCommon(first, second);

        System.out.println("Common letters = " + common);
    }
}
