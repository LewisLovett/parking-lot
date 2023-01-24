package com.nology.parking.vehicles;

public class Van extends Vehicle{

    public Van(int id, ParkingSpots parkingSpot){
        super(id,6,3,1,parkingSpot);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.van;
    }
}