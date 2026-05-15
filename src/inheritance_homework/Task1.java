package inheritance_homework;

class Parent {
    public void showMassage(){
        System.out.println("Hello parent class");
    }
}

    class Child extends Parent{
        @Override
        public void showMassage(){
            System.out.println("Hello child class");
        }
        public void showBothMessages(){
            super.showMassage();
            this.showMassage();
        }
    }
public class Task1 {
     static void main(String[] args) {
        Child child = new Child();
        child.showBothMessages();
    }
}
