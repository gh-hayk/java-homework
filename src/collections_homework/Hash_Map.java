package collections_homework;

import java.util.HashMap;

/*
Առաջադրանք 4 — HashMap
Ստեղծիր HashMap<String, Integer> որտեղ key-ը ուսանողի անունն է, value-ն՝ գնահատականը.

Ավելացրու 4 ուսանող
Ստացիր (get) մեկ ուսանողի գնահատականը
Փոխիր (put նույն key-ով) մեկ ուսանողի գնահատականը
Ջնջիր մեկ ուսանողի
Տպիր բոլոր զույգերը for-each loop-ով
 */
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
//1.put 4 student
        studentGrades.put("Anna", 85);
        studentGrades.put("David", 92);
        studentGrades.put("Mariam", 78);
        studentGrades.put("Hayk", 96);
        System.out.println("1.put 4 student " + studentGrades);

        System.out.println();

//2.Get one student  grade
        System.out.println("2.Get one student grade " + studentGrades.get("Anna"));

        System.out.println();
//3.Change (put with the same key) the grade of one student

        studentGrades.put("Mariam", 86);
        System.out.print("3.Change grade ");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + " " + studentGrades.get(name));
        }

        System.out.println();

//4.Removed one student
        studentGrades.remove("Mariam", 86);
        System.out.println(studentGrades);
    }
}
