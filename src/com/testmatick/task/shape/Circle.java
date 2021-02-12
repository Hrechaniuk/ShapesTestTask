package com.testmatick.task.shape;

import com.testmatick.task.color.Color;

public final class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String draw() {
        return "circle: radius : " + getRadius() +
                ", area : " + getArea() + ", color : " + getColor();
    }
}
