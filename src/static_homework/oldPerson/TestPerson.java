package static_homework.oldPerson;
//5.Create a class with a static method that accepts an array of objects and returns the object with the highest value according to a specific criterion. Use this method in another class to find the oldest person in a list of people.
public class TestPerson {
    public static void main(String[] args) {
        String[] names = {"Ani", "Ashot", "Hayk", "Narek"};
        int[] ages = {18, 2, 32, 45};

        String oldest = Person.oldPers(names, ages);
        System.out.println("oldest person " + oldest);
    }
}
