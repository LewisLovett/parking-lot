package com.nology.parking.vehicles;

public class Motorbike extends Vehicle{

    public Motorbike(int id, ParkingSpots parkingSpot){
        super(id,1,1,1, parkingSpot);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.motorbike;
    }
}
