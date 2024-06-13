package org.example.arge;

public class CarFactory {

    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("mercedes", "mercedes desc", 800, 3000);
        CarSkeleton hybridCar = new HybridCar("toyota", "toyota desc", 40, 4000,4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda", "honda desc", 30, 4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }
    public static void startEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
    }
}
