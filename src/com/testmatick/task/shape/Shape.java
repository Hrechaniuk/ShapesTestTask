package com.testmatick.task.shape;

import com.testmatick.task.color.Color;

import java.util.Random;

public abstract class Shape {

    protected final Color color;

    public Shape() {
        color = getRandomColor();
    }

    private Color getRandomColor() {
        Color[] colors = Color.values();
        Random generator = new Random();
        return colors[generator.nextInt(colors.length)];
    }

    public abstract Color getColor();

    public abstract String draw();

    public abstract double getArea();
}
