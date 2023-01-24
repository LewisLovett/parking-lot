package com.nology.parking.vehicles;

public abstract class Vehicle {

    protected int id;
    protected int requiredNumberOfCompactSpots;
    protected int requiredNumberOfRegularSpots;
    protected int requiredNumberOfLargeSpots;

    protected ParkingSpots parkingSpot;

    public Vehicle(int id, int requiredNumberOfCompactSpots, int requiredNumberOfRegularSpots, int requiredNumberOfLargeSpots, ParkingSpots parkingSpot) {
        this.id = id;
        this.requiredNumberOfCompactSpots = requiredNumberOfCompactSpots;
        this.requiredNumberOfRegularSpots = requiredNumberOfRegularSpots;
        this.requiredNumberOfLargeSpots = requiredNumberOfLargeSpots;
        this.parkingSpot = parkingSpot;
    }

    public Vehicle(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequiredNumberOfCompactSpots() {
        return requiredNumberOfCompactSpots;
    }

    public void setRequiredNumberOfCompactSpots(int requiredNumberOfCompactSpots) {
        this.requiredNumberOfCompactSpots = requiredNumberOfCompactSpots;
    }

    public int getRequiredNumberOfRegularSpots() {
        return requiredNumberOfRegularSpots;
    }

    public void setRequiredNumberOfRegularSpots(int requiredNumberOfRegularSpots) {
        this.requiredNumberOfRegularSpots = requiredNumberOfRegularSpots;
    }

    public int getRequiredNumberOfLargeSpots() {
        return requiredNumberOfLargeSpots;
    }

    public void setRequiredNumberOfLargeSpots(int requiredNumberOfLargeSpots) {
        this.requiredNumberOfLargeSpots = requiredNumberOfLargeSpots;
    }

    public ParkingSpots getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpots parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public abstract VehicleType getType();
}
