package com.allstate.models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class PointTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnDistanceBetweenTwoPoints() throws Exception {

        Point p1 = new Point(1,2);
        Point p2 = new Point(4,3);

        double result = Point.distance(p1,p2);

        Assert.assertEquals(3.16, result, 0.01);

        p1 = new Point(-1,2);
        p2 = new Point(4,-3);

        result = Point.distance(p1,p2);

        Assert.assertEquals(7.07, result, 0.01);

    }

    @Test
    public void shouldReturnSlopeBetweenTwoPoints() throws Exception {

        Point p1 = new Point(1,2);
        Point p2 = new Point(4,3);

        double result = Point.slope(p1,p2);

        Assert.assertEquals(0.33, result, 0.01);

        p1 = new Point(4,2);
        p2 = new Point(4,-3);

        result = Point.slope(p1,p2);

        Assert.assertEquals(POSITIVE_INFINITY, result, 0.01);

        p1 = new Point(3,2);
        p2 = new Point(7,-4);

        result = Point.slope(p1,p2);

        Assert.assertEquals(-1.5, result, 0.01);

        p1 = new Point(-3,3);
        p2 = new Point(3,-1);

        result = Point.slope(p1,p2);

        Assert.assertEquals(-0.66, result, 0.01);

    }

    @Test
    public void shouldReturnYInterceptBetweenTwoPoints() throws Exception {

        Point p1 = new Point(-3,3);
        Point p2 = new Point(3,-1);

        double result = Point.getYIntercept(p1,p2);

        Assert.assertEquals(1, result, 0.01);

        p1 = new Point(3,2);
        p2 = new Point(7,-4);

        result = Point.getYIntercept(p1,p2);

        Assert.assertEquals(6.5, result, 0.01);

    }
}