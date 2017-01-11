package com.allstate.models;

import java.lang.*;

import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Created by localadmin on 11/01/17.
 */
public class Point {

    private int x, y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distance(Point p1, Point p2) {
        return  java.lang.Math.sqrt(Math.square(p1.getX() - p2.getX()) + Math.square(p1.getY() - p2.getY()));
    }

    public static double slope(Point p1, Point p2) {

        double deltaY = (p2.getY() - p1.getY());

        double deltaX = (p2.getX() - p1.getX());

        if(deltaX == 0) return POSITIVE_INFINITY;

        return  deltaY/deltaX;
    }

    public static double getYIntercept(Point p1, Point p2) {

        double slope = slope(p1,p2);

        return ( p1.getY() - slope*p1.getX());
    }
}
