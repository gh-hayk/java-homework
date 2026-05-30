package collections_homework;

import java.util.LinkedList;
import java.util.Queue;

/*
Առաջադրանք 2 — LinkedList որպես Queue (հերթ)
Ստեղծիր LinkedList<Integer> և.

Ավելացրու 5 թիվ offer() մեթոդով
Դիտիր (առանց հեռացնելու) հերթի առաջին տարրը peek()-ով
Հեռացրու 3 տարր poll()-ով
Տպիր մնացած տարրերը
 */
public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
//1.add 5 numbers
        numbers.offer(12);
        numbers.offer(25);
        numbers.offer(37);
        numbers.offer(42);
        numbers.offer(58);
        System.out.println("1.Numbers " + numbers);

        System.out.println();

//2.View the first element of a queue with peek()
        System.out.println("2." + numbers.peek());

        System.out.println();

//3.remowe 3 element with poll()
        //numbers.poll();
        for (int i = 0; i < 3; i++) {
            Integer removed = numbers.poll();
            System.out.println("3.Removed element" + " " + removed);
        }

        System.out.println();

//4.Print remaining element
        System.out.println("4.Print remaining element" + numbers);
    }
}
