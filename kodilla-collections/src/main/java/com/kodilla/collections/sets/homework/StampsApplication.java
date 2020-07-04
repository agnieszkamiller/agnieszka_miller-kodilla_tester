package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("stamp1",1,1,true));
        stamps.add(new Stamp("stamp2",2,1,true));
        stamps.add(new Stamp("stamp1",1,1,true));
        stamps.add(new Stamp("stamp3",2,2,false));
        stamps.add(new Stamp("stamp4",3,1,false));
        stamps.add(new Stamp("stamp1",1,1,true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}
