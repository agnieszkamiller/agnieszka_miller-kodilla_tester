package com.kodilla.inheritance.homework;

public class LauncherOperSys {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1700);
        operatingSystem.turnOf();

        Sub1OperSys example1 = new Sub1OperSys();
        example1.turnOf();
        example1.turnOn();
        Sub2OperSys example2  = new Sub2OperSys(2020);
        example2.turnOn();

    }

}
