package com.testmatick.task.shape;

import com.testmatick.task.color.Color;

/**
 * This class represents right triangle
 */
public final class Triangle extends Shape {

    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public Triangle(double firstLeg, double secondLeg) {
        super();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        hypotenuse = Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String draw() {
        return "triangle, hypotenuse : " + getHypotenuse() + ", area : " + getArea()
                + ", color : " + getColor();
    }
}
