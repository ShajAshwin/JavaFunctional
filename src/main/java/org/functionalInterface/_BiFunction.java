package org.functionalInterface;
import java.util.function.*;

public class _BiFunction {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (incrementBy,multiplyBy) -> (incrementBy + 1) * multiplyBy;
        Function<Integer,String> function = integer -> "The output number is "+ integer;

        System.out.println(function.apply(biFunction.apply(4,10)));
    }
}
