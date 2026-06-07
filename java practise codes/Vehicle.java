class Vehicle {
    void startEngine() {
        System.out.println("Engine Started");
    }
}
class Car extends Vehicle {
    void displayDetails() {
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    void displayDetails() {
        System.out.println("This is a Bike");
    }
}
class Truck extends Vehicle {
    void displayDetails() {
        System.out.println("This is a Truck");
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.displayDetails();
        Bike b = new Bike();
        b.startEngine();
        b.displayDetails();
        Truck t = new Truck();
        t.startEngine();
        t.displayDetails();
    }
}