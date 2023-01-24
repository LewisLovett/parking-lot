package com.nology.parking.vehicles;

import com.nology.parking.ParkingLot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10,10,10);
        VehicleFactory vehicleFactory = new VehicleFactory();

        parkingLot.vehicleValidation(vehicleFactory.createVehicle(1,VehicleType.car,ParkingSpots.compact));

        System.out.println("Press 1 to view number of parking spot remaining");
        Scanner scanner = new Scanner(System.in);
    }


}
