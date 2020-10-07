package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Audi audi = new Audi();

        CarRace carRace = new CarRace();
        System.out.println(carRace.doRace(audi));
        System.out.println(carRace.doRace(ford));
        System.out.println(carRace.doRace(opel));
    }

    public int doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }
}
