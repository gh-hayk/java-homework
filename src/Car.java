//public class Car {
//    String model;
//    int modelNumber;
//    String color;
//    int currentSpeed;
//    boolean isEngineStart;
//
//    public Car(String model, int modelNumber, String color) {
//        this.model = model;
//        this.modelNumber = modelNumber;
//        this.color = color;
//        this.currentSpeed = 0;      // default 0
//        this.isEngineStart = false;  // default false (engine is off)
//    }
//    void startEngine() {
//        if (isEngineStart == false) {
//            isEngineStart = true;
//            System.out.println("Engine started for " + model + " " + modelNumber);
//        } else {
//            System.out.println("Engine is already running!");
//        }
//    }
//    void stopEngine() {
//        if (isEngineStart == true) {
//            if (currentSpeed == 0) {
//                isEngineStart = false;
//                System.out.println("Engine stopped for " + model + " " + modelNumber);
//            } else {
//                System.out.println("Cannot stop engine! Car is moving at speed " + currentSpeed);
//            }
//        } else {
//            System.out.println("Engine is already off!");
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
 public class Car{
     public static void swing() {
               System.out.print("swing ");
            }
   public void climb() {
                 System.out.println("climb ");
             }
     public static void play() {
                swing();
//               climb();
            }
   public static void main(String[] args) {
                Car rope = new Car();
               Car.play();
                Car rope2 = null;
                rope2.play();
            }
 }

