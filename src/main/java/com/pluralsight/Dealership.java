package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    //creating the properties for this class that describe the dealership
    private String name;
    private String adress;
    private String phone;

    //an array list that holds the dealership inventory
    private ArrayList<Vehicle> inventory;

    //constructor to instantiate the inventory
    public Dealership(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;

        //initializing the empty list for the inventory
        this.inventory = new ArrayList<Vehicle>();
    }

    //creating a method to help us filter vehicles by price
    public List<Vehicle> getVehiclesByPrice(double min, double max){
        //returning null for now
        return null;
    }
    //creating a method to help us filter vehicles by make and model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    //creating a method to help us filter vehicles by year
    public List<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    //creating a method to help us filter vehicles by price
    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    //creating a method to help us filter vehicles by mileage
    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    //creating a method to help us filter vehicles by price
    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    //creating a method that gets all vehicles
    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    //creating a method that adds a vehicle
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    //creating a method to remove a vehicle
    public void removeVehicle(){}


    //getters and setters for the rest of the property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
