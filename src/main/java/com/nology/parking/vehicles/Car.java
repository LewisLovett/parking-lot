package com.nology.parking.vehicles;

public class Car extends Vehicle{

    public Car(int id){
        super(id,-1,1,1);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.car;
    }
}