package org.example;

public class Vehicle{
    //Attributes
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    //Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize,String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    //Getters and Setters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    //Display Method
    public void displayInfo() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }

    //Honk Method
    public void honk() {
        System.out.println("Honk, honk!");
    }
}
