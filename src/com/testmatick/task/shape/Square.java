package com.testmatick.task.shape;

import com.testmatick.task.color.Color;

public final class Square extends Shape {

    private final double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String draw() {
        return "square, length of side : " + getSide() +
                ", area : " + getArea() + ", color : " + getColor();
    }
}
