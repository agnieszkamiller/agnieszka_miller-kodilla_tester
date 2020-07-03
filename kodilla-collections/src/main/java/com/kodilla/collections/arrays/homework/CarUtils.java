package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    //z metodą statyczną opisującą samochody o nazwie public static void describeCar(Car car)

    public static void describeCar (Car car){

        if (car instanceof Audi)
            System.out.println("Audi");
        else if (car instanceof Ford)
            System.out.println("Ford");
        else if (car instanceof Opel)
            System.out.println("Opel");
        else
            System.out.println("Nie ma takiego samochodu.");



    }
}
