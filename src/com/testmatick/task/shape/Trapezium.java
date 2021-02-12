package com.testmatick.task.shape;

import com.testmatick.task.color.Color;

public final class Trapezium extends Shape {

    private final double baseOne;
    private final double baseTwo;
    private final double height;

    public Trapezium(double baseOne, double baseTwo, double height) {
        super();
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) / 2 * height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String draw() {
        return ("trapezium, area : " + getArea() + ", color : " + getColor());
    }
}
