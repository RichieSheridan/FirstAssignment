package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(4, "Red", 2.0f, "Petrol");
        myVehicle.displayInfo();
        myVehicle.honk();

        System.out.println("----------------------------------");

        Car myCar = new Car(4, "Blue", 3.5f, "Diesel", "Toyota");
        myCar.displayInfo();
        myCar.honk();

    }
}