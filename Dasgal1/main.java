public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, "Petrol", 15.0, 5);

        Truck truck = new Truck("Ford", "F-150", 2019, "Diesel", 8.0, 1200.0);

        car.refuel(20.0); 
        truck.refuel(50.0);

        System.out.println("\n--- Car Info ---");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");

        System.out.println("\n--- Truck Info ---");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
    }
}
