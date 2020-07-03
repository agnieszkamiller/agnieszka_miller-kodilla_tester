package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarMain {

    public static void main(String[] args) {

        Car car = CarApplication.drawCar();
        CarUtils.describeCar(car);
        System.out.println(car.getSpeed());
    }


}
