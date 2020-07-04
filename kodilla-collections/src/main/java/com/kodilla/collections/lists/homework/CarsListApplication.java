package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Audi();
        Car car2 = new Ford();
        Opel opel = new Opel();
        cars.add(car1);
        cars.add(car2);
        cars.add(opel);
        cars.add(car2);
        cars.add(car1);
        cars.add(car2);
        cars.add(opel);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("******************");
        cars.remove(0);
        cars.remove(5);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("******************");
        cars.remove(opel);
        cars.remove(car1);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
