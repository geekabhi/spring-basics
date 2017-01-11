package com.allstate.models;

import java.util.List;

/**
 * Created by localadmin on 11/01/17.
 */
public class Triangle {
    private int height;
    private int width;

    public Triangle() {}

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return getHeight() * getWidth() * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public static double area(List<Triangle> triangles) {
        return triangles.stream().map( e -> e.getArea()).reduce(0d, (acc, curr) -> acc + curr );
    }
}
