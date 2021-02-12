package com.testmatick.task;

import com.testmatick.task.shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numShapes = 0;
        while (numShapes <= 0) {
            System.out.print("Input a number: ");
            try {
                Scanner in = new Scanner(System.in);
                numShapes = in.nextInt();
                if (numShapes <= 0) {
                    System.out.println("Wrong number");
                }
            } catch (Exception e) {
                System.out.println("Wrong number");
            }
        }

        List<Shape> shapes = new ArrayList<>(numShapes);
        for (int i = 0; i < numShapes; i++) {
            shapes.add(getRandomShape());
        }

        for (Shape shape : shapes) {
            System.out.println("Shape : " + shape.draw());
        }
    }

    private static Shape getRandomShape() {
        Random random = new Random();
        int shape = random.nextInt(4);
        switch (shape) {
            case 0:
                return new Circle(getRandomNumber(random));
            case 1:
                return new Square(getRandomNumber(random));
            case 2:
                return new Trapezium(getRandomNumber(random),
                        getRandomNumber(random), getRandomNumber(random));
            case 3:
                return new Triangle(getRandomNumber(random), getRandomNumber(random));
        }
        return null;
    }

    private static double getRandomNumber(Random random) {
        double number = 0.0;
        while (number == 0.0) {
            number = random.nextDouble() * 100;
        }
        return number;
    }
}
