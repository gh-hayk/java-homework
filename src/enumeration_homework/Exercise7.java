package enumeration_homework;

public enum Exercise7 {
    SMALL, MEDIUM, LARGE;

    public static void main(String[] args) {
        for (Exercise7 size : Exercise7.values()) {
            System.out.println("Անուն: " + size.name() + ", Կարգային համար: " + size.ordinal());
        }
    }
}
