public class Car {
    // Private fields
    private String brand;
    private int speed;

    // Public getter and setter methods for encapsulated fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    // Public method for starting the car
    public void startCar() {
        if (checkEngine()) {
            System.out.println("Car is starting...");
        } else {
            System.out.println("Car cannot start. Check engine failed!");
        }
    }

    // Private method that the user doesn't need to access
    private boolean checkEngine() {
        // Internal logic to verify engine condition
        System.out.println("Performing engine check...");
        return true; // Simulated engine check result
    }
}
