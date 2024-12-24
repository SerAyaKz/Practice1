import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Set car properties
        myCar.setBrand("Honda");
        myCar.setSpeed(100);
        // This brakes encapsulation principle
//        myCar.Brand = "";

        // Display car properties
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");

        // Start the car (engine check is done internally, hidden from the user)
        myCar.startCar();


        // The following line will cause a compilation error because checkEngine is private:
        // myCar.checkEngine();
    }
}