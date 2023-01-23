package com.nology.parking.vehicles;

public class Van extends Vehicle{

    public Van(int id){
        super(id,1,1,1);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.van;
    }
}