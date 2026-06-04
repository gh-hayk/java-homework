package generic_homework;

/*
5.Create a generic type to represent a pair of objects. The two objects in the pair can be of different types Example usage: Pair p = new Pair(…)
 */
public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Alica", 11);
        System.out.println("Pair 1 " + p1);
        System.out.println("Name: " + p1.getFirst());
        System.out.println("Number: " + p1.getSecond());

        Pair<Double, Boolean> p2 = new Pair<>(3.14, true);
        System.out.println("Pair 2 " + p2);


    }
}
