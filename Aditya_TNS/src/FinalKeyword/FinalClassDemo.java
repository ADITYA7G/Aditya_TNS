package FinalKeyword;

final class Vehicle {
    void displayType() {
        System.out.println("This is a vehicle.");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayType(); // Output: This is a vehicle.
    }
}
