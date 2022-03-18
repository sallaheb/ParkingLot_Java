package com.nology;

public abstract class Parking {
    String nameOfVehicle;
    int totalNumberParkingSpots;

    public Parking(String nameOfVehicle, int totalNumberParkingSpots) {
        this.nameOfVehicle = nameOfVehicle;
        this.totalNumberParkingSpots = totalNumberParkingSpots;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public int getTotalNumberParkingSpots() {
        return totalNumberParkingSpots;
    }

    public abstract int park();
}
