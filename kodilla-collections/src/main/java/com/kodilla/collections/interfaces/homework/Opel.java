package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    public int speed;

//    public (int speed){
//        this.speed = speed;
//    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;

    }
}
