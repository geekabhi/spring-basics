package com.allstate.models;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by localadmin on 11/01/17.
 */
public class Math {

    public static int square(int i) {
        return i*i;
    }

    public static int factorial(int i) {
        return Stream.iterate(1, n -> n+1).limit(i).reduce(1, (acc, curr) -> acc * curr);
    }

    public static int fibonacci1(int fib,int seed,int x){

        if(x == 0 || x == 1) return x;

        if(seed == x){
            return fib;
        }
        else {

            seed++;
            fib +=seed;

            return fibonacci1(fib, seed, x);
        }
    }

    public static int fibonacci(int x){
        if(x < 2)
            return x;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

}
