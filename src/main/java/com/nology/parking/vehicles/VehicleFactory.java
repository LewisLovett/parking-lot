package com.nology.parking.vehicles;

public class VehicleFactory {

    public Vehicle createVehicle(int id,VehicleType type,ParkingSpots spot){
        switch (type){
            case motorbike:
                return new Motorbike(id,spot);
            case car:
                return new Car(id,spot);
            case van:
                return new Van(id,spot);
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
