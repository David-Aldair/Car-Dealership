package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    private final String FILE_PATH = "src/main/resources/inventory.csv";

    public Dealership getDealership(){

        //this is the placeholder for our dealership
        Dealership theDealership = null;

        try{
            //buffered reader tp read the csv file
            BufferedReader fileReader = new BufferedReader(new FileReader(FILE_PATH));

            //grabbing the first line since it's the dealership info and we need that to create our dealership
            String dealershipInfo = fileReader.readLine();

            if(dealershipInfo != null){

                //break apart the dealership info into
                String[] dealershipParts = dealershipInfo.split("\\|");
                String name = dealershipParts[0];
                String address = dealershipParts[1];
                String phoneNum = dealershipParts[2];

                //creating the dealership
                theDealership = new Dealership(name, address,phoneNum);

            }
            String vehicleInfo;
            while((vehicleInfo = fileReader.readLine()) != null) {

                String[] vehicleParts = vehicleInfo.split("\\|");

                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String vehicleType = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);


            }
        } catch (Exception e) {
            System.out.println("Couldn't parse the inventory file" + e.getMessage());
        }


        return null;
    }
    public void saveDealership(){
    }
}
