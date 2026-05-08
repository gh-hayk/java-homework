package static_homework.oldPerson;
//5.Create a class with a static method that accepts an array of objects and returns the object with the highest value according to a specific criterion. Use this method in another class to find the oldest person in a list of people.
public class Person {
    public static String oldPers(String[] names, int[] ages) {
        int oldIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > ages[oldIndex]) {
                oldIndex = i;
            }
        }

        return names[oldIndex];
    }
}
