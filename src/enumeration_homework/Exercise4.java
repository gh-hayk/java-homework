package enumeration_homework;

public enum Exercise4 {

    ADD {
        public double apply(double a, double b) { return a + b; }
    },
    SUBTRACT {
        public double apply(double a, double b) { return a - b; }
    },
    MULTIPLY {
        public double apply(double a, double b) { return a * b; }
    },
    DIVIDE {
        public double apply(double a, double b) { return a / b; }
    };

    public abstract double apply(double a, double b);

    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println("Գումարում:    " + ADD.apply(a, b));
        System.out.println("Հանում:       " + SUBTRACT.apply(a, b));
        System.out.println("Բազմապատկում: " + MULTIPLY.apply(a, b));
        System.out.println("Բաժանում:     " + DIVIDE.apply(a, b));
    }
}
