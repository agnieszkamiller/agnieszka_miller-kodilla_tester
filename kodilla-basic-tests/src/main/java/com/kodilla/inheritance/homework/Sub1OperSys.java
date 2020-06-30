package com.kodilla.inheritance.homework;

public class Sub1OperSys extends OperatingSystem {

    Sub1OperSys() {
        super(2000);
    }

    @Override
    public void turnOf() {
        System.out.println("Win95 został wyłaczony w roku: " + super.getYear());
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(super.getYear());
    }
}
