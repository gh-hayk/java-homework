package static_homework.count;
//1.Create a class with a private static field and a public static method that modifies the value of the field. Write a test class to verify that the value of the field is correctly updated.
public class TestCount {

    public static void main(String[] args) {
        System.out.println(count.getCount()); // 0

        count.increment();
        count.increment();
        count.increment();

        System.out.println(count.getCount()); // 3
    }
}
