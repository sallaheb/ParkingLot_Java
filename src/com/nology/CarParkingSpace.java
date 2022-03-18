package com.nology;

public class CarParkingSpace extends Parking {
    public int numberOfVehiclesParked;
    public int normalSpaceOccupied;

    public CarParkingSpace() {
        super("car", 40);
    }

    public CarParkingSpace(int numberOfVehiclesParked, int normalSpaceOccupied) {
        super("car", 40);
        this.numberOfVehiclesParked = numberOfVehiclesParked;
        this.normalSpaceOccupied = normalSpaceOccupied;
    }

    @Override
    public int park() {

       int spacesTaken = this.numberOfVehiclesParked * this.normalSpaceOccupied;
        return spacesTaken;
    }
}
