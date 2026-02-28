package OOP.Interface;

interface Vehicle {
    // Default method - inherited
    default void honk() {
        System.out.println("Beep beep!");
    }

    // Static method - NOT inherited
    static void showMaintenanceRules() {
        System.out.println("Check oil every 5000 miles.");
    }
}

class Car implements Vehicle {
    // I don't NEED to override honk(), but I can.
    // I CANNOT access showMaintenanceRules() as Car.showMaintenanceRules()
}

// Usage:
// Car myCar = new Car();
// myCar.honk(); // Valid: calls the default method
// myCar.showMaintenanceRules(); // COMPILER ERROR
// Car.showMaintenanceRules();   // COMPILER ERROR
// Vehicle.showMaintenanceRules();  // VALID: Must be called on the interface itself
