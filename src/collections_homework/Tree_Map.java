package collections_homework;


import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {

        TreeMap<Student, Integer> studentGrades = new TreeMap<>();

//Create a Student class with an age field.
        Student student1 = new Student("Աննա", 20);
        Student student2 = new Student("Դավիթ", 22);
        Student student3 = new Student("Մարիամ", 19);
        Student student4 = new Student("Հայկ", 21);
        Student student5 = new Student("Լիլիթ", 20);

        studentGrades.put(student1, 85);
        studentGrades.put(student2, 92);
        studentGrades.put(student3, 78);
        studentGrades.put(student4, 96);
        studentGrades.put(student5, 88);

    }
}
