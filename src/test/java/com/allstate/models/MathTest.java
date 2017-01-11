package com.allstate.models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquareAnInteger() throws Exception {
        int result = Math.square(4);

        Assert.assertEquals(16, result);

        result = Math.square(5);
        Assert.assertEquals(25, result);

    }

    @Test
    public void shouldFactorialAnInteger() throws Exception {
        int result = Math.factorial(5);

        Assert.assertEquals(120, result);

        result = Math.factorial(3);

        Assert.assertEquals(6, result);
    }

    @Test
    public void shouldFibonacciAnInteger() throws Exception {

        int result = Math.fibonacci(0);

        Assert.assertEquals(0, result);

        result = Math.fibonacci(1);

        Assert.assertEquals(1, result);

        result = Math.fibonacci(2);

        Assert.assertEquals(1, result);

        result = Math.fibonacci(3);

        Assert.assertEquals(2, result);

        result = Math.fibonacci(4);

        Assert.assertEquals(3, result);

        result = Math.fibonacci(5);

        Assert.assertEquals(5, result);

        result = Math.fibonacci(11);

        Assert.assertEquals(89, result);
    }




}