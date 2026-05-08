package static_homework.count;
//1.Create a class with a private static field and a public static method that modifies the value of the field. Write a test class to verify that the value of the field is correctly updated.
public class count {
    private static int count = 0;

    public static void increment() {
        count = count + 1;

    }

    public static int getCount() {
        return count;
    }

}
