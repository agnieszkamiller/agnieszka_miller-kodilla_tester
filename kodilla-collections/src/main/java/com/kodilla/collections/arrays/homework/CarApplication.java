package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    static Random random = new Random();
    //z metodą public static Car drawCar(), która będzie tworzyła losowy samochód z losowo zwiększoną prędkością.

    public static Car drawCar() {
        int drawnCar = random.nextInt(3);

        int speedCar = random.nextInt(300);
        Car car;
        if (drawnCar == 0) {
            Audi audi = new Audi();
            audi.speed += speedCar;
            return audi;
        } else if (drawnCar == 1) {
            Ford ford = new Ford();
            ford.speed += speedCar;
            return ford;
        } else {
            Opel opel = new Opel();
            opel.speed += speedCar;
            car = opel;
        }
        return car;
    }

    public static Car[] creatingCarArray() {
        Car[] carArray = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = drawCar();
        }
        return carArray;
    }

    public static void main(String[] args) {
        Car[] cars = creatingCarArray();
        showCars(cars);
    }

    public static void showCars(Car[] cars) {
        int wielkoscTablicy = cars.length;
        System.out.println("Losowana wielkość tablicy: " + wielkoscTablicy);
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            CarUtils.describeCar(car);
            System.out.println("Prędkość smochodu: " + car.getSpeed());
        }
    }

}
