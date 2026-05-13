package enumeration_homework;

public enum Exercise3 {

    RED {
        public Exercise3 getNextLight() { return GREEN; }
    },
    YELLOW {
        public Exercise3 getNextLight() { return RED; }
    },
    GREEN {
        public Exercise3 getNextLight() { return YELLOW; }
    };

    // Abstract մեթոդ - ամեն արժեք պետք է կատարի այն
    public abstract Exercise3 getNextLight();

    public static void main(String[] args) {
        Exercise3 light = RED;
        System.out.println("Ներկայիս վիճակ: " + light);

        light = light.getNextLight();
        System.out.println("Հաջորդ վիճակ:   " + light);

        light = light.getNextLight();
        System.out.println("Հաջորդ վիճակ:   " + light);
    }
}