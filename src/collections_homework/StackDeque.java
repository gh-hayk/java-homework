package collections_homework;

import java.util.ArrayDeque;

public class StackDeque {
    public static void main(String[] args) {
//1.Push 4 word
        ArrayDeque<String> word = new ArrayDeque<>();
        word.push("Sun");
        word.push("Window");
        word.push("Door");
        word.push("Beach");
        System.out.println("1.Push 4 word " + word);

        System.out.println();

//2.Removed 2 word with pop()

        System.out.print("2.Removed 2 word ");

        for (int i = 0; i < 2; i++) {
            String removed = word.pop();
            System.out.print(removed + " ");
        }

        System.out.println();

//3.Print remaining element


        System.out.println();

        System.out.println("3.Remaining element " + word);


    }
}
