package com.nology.parking.vehicles;

import com.nology.parking.ParkingLot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10,10,10);
        VehicleFactory vehicleFactory = new VehicleFactory();

        parkingLot.vehicleValidation(vehicleFactory.createVehicle(1,VehicleType.car,ParkingSpots.compact));
        parkingLot.vehicleValidation(vehicleFactory.createVehicle(2,VehicleType.motorbike,ParkingSpots.compact));
        parkingLot.vehicleValidation(vehicleFactory.createVehicle(3,VehicleType.car,ParkingSpots.regular));
        parkingLot.vehicleValidation(vehicleFactory.createVehicle(4,VehicleType.van,ParkingSpots.large));

        while(true) {
            if (parkingLot.checkIfParkingLotIsEmpty()) {
                System.out.println("The parking lot is empty");
            }
            if (parkingLot.checkIfParkingLotIsFull()) {
                System.out.println("The parking lot is full");
            }
            if(parkingLot.checkIfCompactSpacesAreFull()){
                System.out.println("There are no more available compact spaces");
            }
            if(parkingLot.checkIfRegularSpacesAreFull()){
                System.out.println("There are no more available regular spaces");
            }
            if(parkingLot.checkIfLargeSpacesAreFull()){
                System.out.println("There are no more available large spaces");
            }

            System.out.println("Press 1 to view number of parking spot remaining");
            System.out.println("Press 2 to view total number of spots");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.equals("1")){
                int remainingCompactSpaces = parkingLot.getNumberOfCompactSpaces() - parkingLot.getNumberOfUsedCompactSpaces();
                int remainingRegularSpaces = parkingLot.getNumberOfRegularSpaces() - parkingLot.getNumberOfUsedRegularSpaces();
                int remainingLargeSpaces = parkingLot.getNumberOfLargeSpaces() - parkingLot.getNumberOfUsedLargeSpaces();
                System.out.println(String.format("There are %s compact spaces, %s regular spaces and %s large spaces", remainingCompactSpaces, remainingRegularSpaces,remainingLargeSpaces));
            } else if (input.equals("2")) {
                int totalNumberOfSpots = parkingLot.getNumberOfCompactSpaces() + parkingLot.getNumberOfRegularSpaces()+ parkingLot.getNumberOfLargeSpaces();
                System.out.println(String.format("The total number of spots are %d",totalNumberOfSpots));
            }

        }
    }


}
