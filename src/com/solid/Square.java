package com.solid;

public class Square implements I2DShape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size,2);
    }
}
