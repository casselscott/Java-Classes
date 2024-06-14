// VehicleCar.java
public class VehicleCar {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Corolla", 2020, 4);

        // Use Vehicle methods
        myCar.start();
        myCar.stop();

        // Use Car method
        myCar.displayDetails();
    }
}
