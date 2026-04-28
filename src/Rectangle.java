public class Rectangle {
    private int lenght;
    private int widht;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 14);
        int area = rectangle.calculateArea();
        System.out.println("Area (lenght * widht) " + rectangle.getLenght() + " * " + rectangle.getWidht() + " = " + area );
    }

    public Rectangle(int lenght, int widht){
        this.lenght = lenght;
        this.widht = widht;
    }
    public int calculateArea(){
            return lenght * widht;
    }
    public int getLenght(){
            return lenght;
    }
    public int getWidht(){
            return widht;
    }
}
