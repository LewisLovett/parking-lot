package com.nology.parking.vehicles;

public class Car extends Vehicle{

    public Car(int id, ParkingSpots parkingSpot){
        super(id,1,1,1,parkingSpot);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.car;
    }
}