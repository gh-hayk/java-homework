package enumeration_homework;

interface Drawable {
    void draw();
}

public enum Exercise6 implements Drawable {

    CIRCLE {
        public void draw() { System.out.println("Նկարում եմ ⬤ շրջան"); }
    },
    SQUARE {
        public void draw() { System.out.println("Նկարում եմ ■ քառակուսի"); }
    },
    TRIANGLE {
        public void draw() { System.out.println("Նկարում եմ ▲ եռանկյուն"); }
    };

    public static void main(String[] args) {
        for (Exercise6 shape : Exercise6.values()) {
            shape.draw();
        }
    }
}

