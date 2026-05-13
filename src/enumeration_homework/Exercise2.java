package enumeration_homework;

public enum Exercise2 {
    EARTH(5.97e24, 6371), MARS(6.42e23, 3389);

    private double mass;
    private double radius;

     Exercise2(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }

    public static void main(String[] args) {
        System.out.println("Երկիր - Կշիռ: " + EARTH.getMass() + ", Շառավիղ: " + EARTH.getRadius() + " կմ");
        System.out.println("Մարս  - Կշիռ: " + MARS.getMass() + ", Շառավիղ: " + MARS.getRadius() + " կմ");
    }
}
