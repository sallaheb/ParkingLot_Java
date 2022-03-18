package com.nology;

public class VanParkingSpaces extends Parking{
    public int numberOfVehiclesParked;
    public int normalSpaceOccupied;

    public VanParkingSpaces() {
        super("van", 40);
    }

    public VanParkingSpaces(int numberOfVehiclesParked, int normalSpaceOccupied) {
        super("van", 40);
        this.numberOfVehiclesParked = numberOfVehiclesParked;
        this.normalSpaceOccupied = normalSpaceOccupied;
    }

    @Override
    public int park() {

        int spacesTaken = this.numberOfVehiclesParked * this.normalSpaceOccupied;
        return spacesTaken;
    }
}
