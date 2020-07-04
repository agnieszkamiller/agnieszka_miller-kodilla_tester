package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private int width;
    private int hight;
    private boolean stamped;

    public Stamp(String name, int width, int hight, boolean stamped) {
        this.name = name;
        this.width = width;
        this.hight = hight;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return width == stamp.width &&
                hight == stamp.hight &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, hight, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", hight=" + hight +
                ", stamped=" + stamped +
                '}';
    }
}
