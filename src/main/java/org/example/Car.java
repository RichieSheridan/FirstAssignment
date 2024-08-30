package org.example;

public class Car extends Vehicle {
    //New attribute
    private String brand;

    //Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType); // Call the superclass constructor
        this.brand = brand;
    }

    //Getters and Setters
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    //Override displayInfo method to include brand
    @Override
    public void displayInfo(){
        super.displayInfo(); // Call the superclass method
        System.out.println("Brand: " + brand);
    }
}
