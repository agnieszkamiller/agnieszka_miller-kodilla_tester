package com.kodilla.inheritance.homework;

public class Sub2OperSys extends OperatingSystem {

    Sub2OperSys(int year) {
        super(year);
    }

    @Override
    public void turnOf() {
        super.turnOf();
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(getYear());
    }
}
