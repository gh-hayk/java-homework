package inheritance_homework;

class Car {
    private int passengerCount;
    private char engineType;

    public Car(int passengerCount, char engineType) {
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 2) {
            System.out.println("Սխալ: passengerCount-ը չի կարող 2-ից պակաս լինել։");
        } else {
            this.passengerCount = passengerCount;
        }
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (Character.isLetter(engineType)) {
            this.engineType = engineType;
        } else {
            System.out.println("Սխալ: engineType-ը պետք է լինի մեկ տառ (a-z կամ A-Z)։");
        }
    }
}

class Truck extends Car {
    private int capacity;

    public Truck(int passengerCount, char engineType) {
        super(passengerCount, engineType);
        this.capacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Truck truck = new Truck(3, 'V');

        System.out.println("PassengerCount: " + truck.getPassengerCount());
        System.out.println("EngineType: " + truck.getEngineType());
        System.out.println("Capacity: " + truck.getCapacity());

        truck.setCapacity(1000);
        System.out.println("New Capacity: " + truck.getCapacity());
    }
}