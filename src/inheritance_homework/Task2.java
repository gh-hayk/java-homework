package inheritance_homework;

class  SuperClass{
    String massage = "Hello SuperClass class";
}
class SubClass extends SuperClass{
    String massage = "Hellon SubClass class";

    public void printBothMassages(){
        System.out.println(super.massage);
        System.out.println(this.massage);
    }
}
public class Task2 {
    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.printBothMassages();
    }
}

