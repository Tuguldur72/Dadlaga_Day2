public class main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, "Gasoline", 15.0, 5);
        
        Truck myTruck = new Truck("Volvo", "FH", 2018, "Diesel", 8.0, 3000.0);
        
        double fuelUsedCar = 10.0;     
        double fuelUsedTruck = 20.0;   

        System.out.println("=== Car Information ===");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Fuel Type: " + myCar.getFuelType());
        System.out.println("Seats: " + myCar.getNumSeats());
        System.out.println("Adjusted Fuel Efficiency: " + myCar.calculateFuelEfficiency() + " km/l");
        System.out.println("Estimated Distance Traveled: " + (myCar.calculateFuelEfficiency() * fuelUsedCar) + " km");
        System.out.println("Max Speed: " + myCar.getMaxSpeed() + " km/h");

        System.out.println();

        System.out.println("=== Truck Information ===");
        System.out.println("Make: " + myTruck.getMake());
        System.out.println("Model: " + myTruck.getModel());
        System.out.println("Year: " + myTruck.getYear());
        System.out.println("Fuel Type: " + myTruck.getFuelType());
        System.out.println("Cargo Capacity: " + myTruck.getCargoCapacity() + " kg");
        System.out.println("Adjusted Fuel Efficiency: " + myTruck.calculateFuelEfficiency() + " km/l");
        System.out.println("Estimated Distance Traveled: " + (myTruck.calculateFuelEfficiency() * fuelUsedTruck) + " km");
        System.out.println("Max Speed: " + myTruck.getMaxSpeed() + " km/h");
    }
}
