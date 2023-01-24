package com.nology.parking;

import com.nology.parking.vehicles.*;

import java.util.ArrayList;

import static com.nology.parking.vehicles.VehicleType.car;

public class ParkingLot {

    protected int numberOfCompactSpaces;
    protected int numberOfUsedCompactSpaces;
    protected int numberOfRegularSpaces;
    protected int numberOfUsedRegularSpaces;

    public int getNumberOfCompactSpaces() {
        return numberOfCompactSpaces;
    }

    public void setNumberOfCompactSpaces(int numberOfCompactSpaces) {
        this.numberOfCompactSpaces = numberOfCompactSpaces;
    }

    public int getNumberOfUsedCompactSpaces() {
        return numberOfUsedCompactSpaces;
    }

    public void setNumberOfUsedCompactSpaces(int numberOfUsedCompactSpaces) {
        this.numberOfUsedCompactSpaces = numberOfUsedCompactSpaces;
    }

    public int getNumberOfRegularSpaces() {
        return numberOfRegularSpaces;
    }

    public void setNumberOfRegularSpaces(int numberOfRegularSpaces) {
        this.numberOfRegularSpaces = numberOfRegularSpaces;
    }

    public int getNumberOfUsedRegularSpaces() {
        return numberOfUsedRegularSpaces;
    }

    public void setNumberOfUsedRegularSpaces(int numberOfUsedRegularSpaces) {
        this.numberOfUsedRegularSpaces = numberOfUsedRegularSpaces;
    }

    public int getNumberOfLargeSpaces() {
        return numberOfLargeSpaces;
    }

    public void setNumberOfLargeSpaces(int numberOfLargeSpaces) {
        this.numberOfLargeSpaces = numberOfLargeSpaces;
    }

    public int getNumberOfUsedLargeSpaces() {
        return numberOfUsedLargeSpaces;
    }

    public void setNumberOfUsedLargeSpaces(int numberOfUsedLargeSpaces) {
        this.numberOfUsedLargeSpaces = numberOfUsedLargeSpaces;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Vehicle> cars) {
        this.cars = cars;
    }

    public ArrayList<Vehicle> getVans() {
        return vans;
    }

    public void setVans(ArrayList<Vehicle> vans) {
        this.vans = vans;
    }

    public ArrayList<Vehicle> getMotorbikes() {
        return motorbikes;
    }

    public void setMotorbikes(ArrayList<Vehicle> motorbikes) {
        this.motorbikes = motorbikes;
    }

    protected int numberOfLargeSpaces;
    protected int numberOfUsedLargeSpaces;

    protected ArrayList<Vehicle> cars = new ArrayList<>();
    protected ArrayList<Vehicle> vans = new ArrayList<>();
    protected ArrayList<Vehicle> motorbikes = new ArrayList<>();

    public ParkingLot(int numberOfCompactSpaces, int numberOfRegularSpaces, int numberOfLargeSpaces) {
        this.numberOfCompactSpaces = numberOfCompactSpaces;
        this.numberOfRegularSpaces = numberOfRegularSpaces;
        this.numberOfLargeSpaces = numberOfLargeSpaces;
        this.numberOfUsedCompactSpaces = 0;
        this.numberOfUsedRegularSpaces = 0;
        this.numberOfUsedLargeSpaces = 0;
    }

    public void vehicleValidation(Vehicle vehicle){
                switch (vehicle.getParkingSpot()) {
                    case compact:
                        if (numberOfUsedCompactSpaces + vehicle.getRequiredNumberOfCompactSpots() > numberOfCompactSpaces) {
                            System.out.println("Not enough compact spaces to park a");
                        } else {
                            numberOfUsedCompactSpaces = numberOfUsedCompactSpaces + vehicle.getRequiredNumberOfCompactSpots();
                            addVehicle(vehicle);
                        }
                        break;
                    case regular:
                        if (numberOfUsedRegularSpaces + vehicle.getRequiredNumberOfRegularSpots() > numberOfRegularSpaces) {
                            System.out.println("Not enough regular spaces to park");
                        } else {
                            numberOfUsedRegularSpaces = numberOfUsedRegularSpaces + vehicle.getRequiredNumberOfRegularSpots();
                            addVehicle(vehicle);
                        }
                        break;
                    case large:
                        if (numberOfUsedLargeSpaces + vehicle.getRequiredNumberOfLargeSpots() > numberOfLargeSpaces) {
                            System.out.println("Not enough large spaces to park");
                        } else {
                            numberOfUsedLargeSpaces = numberOfUsedRegularSpaces + vehicle.getRequiredNumberOfLargeSpots();
                            addVehicle(vehicle);
                        }
                        break;

                }


    }

    public void addVehicle(Vehicle vehicle){
        switch (vehicle.getType()){
            case motorbike:
                motorbikes.add(vehicle);
                break;
            case car:
                cars.add(vehicle);
                break;
            case van:
                vans.add(vehicle);
                break;
        }
    }

    public boolean checkIfParkingLotIsFull(){
        if(numberOfUsedCompactSpaces==numberOfCompactSpaces&&numberOfUsedRegularSpaces==numberOfRegularSpaces&&numberOfUsedLargeSpaces==numberOfLargeSpaces){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfParkingLotIsEmpty(){
        if(numberOfUsedCompactSpaces==0&&numberOfUsedRegularSpaces==0&&numberOfUsedLargeSpaces==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfCompactSpacesAreFull(){
        if(numberOfUsedCompactSpaces==numberOfCompactSpaces){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfRegularSpacesAreFull(){
        if(numberOfUsedRegularSpaces==numberOfRegularSpaces){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfLargeSpacesAreFull(){
        if(numberOfUsedLargeSpaces==numberOfLargeSpaces){
            return true;
        }else{
            return false;
        }
    }
}
