package collections_homework;

import java.util.TreeMap;

class Student implements Comparable<Student> {
    String name;
    int age;

    // Constructor — ուսանող ստեղծելու համար
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // ascending (փոքրից մեծ)
    }
    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}


public class Tree_Map {
    public static void main(String[] args) {

        TreeMap<Student, Integer> st = new TreeMap<>();

        st.put(new Student("Ani", 22), 85);
        st.put(new Student("Mariam", 25), 90);
        st.put(new Student("Hayk", 20), 92);
        st.put(new Student("Narek", 22), 89);

        for (Student s : st.keySet()) {
            System.out.println(s + " -> " + st.get(s));
        }



    }
}