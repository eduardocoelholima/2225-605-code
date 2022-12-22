package classes.vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1("Honda", 30, 15, 100);
        vehicle1.accelerate(20);

        Vehicle1 vehicle1ref = vehicle1;      // reference to same vehicle
        vehicle1ref.decelerate(10);

        System.out.println(vehicle1);         // implicit: vehicle.toString()

        Vehicle1 vehicle2 = new Vehicle1();
        System.out.println("Location: " + vehicle2.getLocation());
        System.out.println(vehicle2);         // implicit: vehicle.toString()

        Vehicle1 vehicle3 = new Vehicle1();
        System.out.println("Same vehicle? " + (vehicle2 == vehicle3));
        System.out.println("Equivalent vehicle? " + (vehicle2.equals(vehicle3)));
    }
}