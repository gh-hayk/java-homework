package collections_homework;

import java.util.HashSet;

/*
Առաջադրանք 5 — HashSet
Ստեղծիր HashSet<String>.

Փորձիր ավելացնել 2 նույն բառ — ի՞նչ է կատարվում
Ստուգիր contains()-ով արդյոք մի բառ կա
Տպիր բոլոր տարրերը
 */
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
//1.Try adding 2 of the same words — what happens?
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Sun");
        hashSet.add("World");
        hashSet.add("Planet");
        System.out.println("1." + hashSet);

        System.out.println();

//2.Check if a word exists with contains()
        String checkWord = "Hello";
        if (hashSet.contains(checkWord)) {
            System.out.println("2.The word is in the HashSet.");
        } else {
            System.out.println("2.The word is not in the HashSet.");
        }

        System.out.println();

//3.Print all elemnet
        System.out.println("3." + hashSet);


    }
}
