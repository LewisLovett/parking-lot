package com.nology.parking.vehicles;

public class Motorbike extends Vehicle{

    public Motorbike(int id){
        super(id,1,1,1);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.motorbike;
    }
}
