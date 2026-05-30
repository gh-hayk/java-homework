package collections_homework;

public class ArrayList {
    public static void main(String[] args) {
//1.add 5 names
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Anna");
        names.add("Gor");
        names.add("Gugush");
        names.add("Atom");
        names.add("Narek");

        System.out.println("1.Names List " + names);
        System.out.println();
//2.print all names for-each loop
        for (String name : names) {
            System.out.println("2." + name);
        }
//3.remove index 2 name
        System.out.println();
        names.remove(2);
        System.out.println("3." + names);
//4.Check the "Anna" name is on the list
        System.out.println();
        String searchName = "Anna";
        if (names.contains(searchName)) {
            System.out.println("4." + searchName + " Name is on the list");
        } else {
            System.out.println("4." + searchName + " Name is on not the list");
        }
//5.print list size
        System.out.println();
        System.out.println("5." + names.size());

    }
}
