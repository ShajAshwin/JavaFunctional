package org.functionalInterface;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        Function<Integer,Integer> increment = number -> number +1;
        Function<Integer,Integer> multiply  = number -> number *10;


        Function<Integer, Integer> Function = increment.andThen(multiply);
        System.out.println(Function.apply(4));




    }
}
