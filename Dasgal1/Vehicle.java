public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    private double fuel;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
        this.fuel = 0.0;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getFuelType() { return fuelType; }
    public double getFuelEfficiency() { return fuelEfficiency; }
    public double getFuel() { return fuel; }

    public void refuel(double liters) {
        if (liters > 0) {
            fuel += liters;
            System.out.println("Refueled " + liters + " liters. Current fuel: " + fuel + " liters.");
        } else {
            System.out.println("Invalid amount to refuel.");
        }
    }

    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}
