class Car {
    String brand;
    String model;
    String fuel;
    void start() {
        System.out.println("Car Started");
    }
    void stop() {
        System.out.println("Car Stopped");
    }
    void displayInfo() {
        System.out.println(brand + " " + model + " " + fuel);
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Innova";
        c.fuel = "Diesel";
        c.start();
        c.displayInfo();
        c.stop();
    }
}