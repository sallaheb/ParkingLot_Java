package com.nology;

public class Main {

    public static void main(String[] args) {
	// write your code here


        CarParkingSpace car = new CarParkingSpace(3,1);
        VanParkingSpaces van = new VanParkingSpaces(2,3);
        MotorCycleCarSpace motorcycles = new MotorCycleCarSpace(2,1);
        int parkingSpaces = car.getTotalNumberParkingSpots();

        int remainingSpaces = (parkingSpaces - (car.park()+ van.park() + motorcycles.park()));

        System.out.println(remainingSpaces);


    }
}
