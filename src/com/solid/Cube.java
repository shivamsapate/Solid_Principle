package com.solid;

public class Cube implements I3DShape {
    int size;

    public Cube(int size) {
        this.size = size;
    }

    @Override
    public double getVolume() {
        return Math.pow(size, 3);
    }
}
