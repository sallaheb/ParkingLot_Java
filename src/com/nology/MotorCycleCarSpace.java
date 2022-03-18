package com.nology;

public class MotorCycleCarSpace extends Parking{
    public int numberOfVehiclesParked;
    public int normalSpaceOccupied;

    public MotorCycleCarSpace() {
        super("motorcycle", 40);
    }

    public MotorCycleCarSpace(int numberOfVehiclesParked, int normalSpaceOccupied) {
        super("motorcycle", 40);
        this.numberOfVehiclesParked = numberOfVehiclesParked;
        this.normalSpaceOccupied = normalSpaceOccupied;
    }

    @Override
    public int park() {

        int spacesTaken = this.numberOfVehiclesParked * this.normalSpaceOccupied;
        return spacesTaken;
    }
}
