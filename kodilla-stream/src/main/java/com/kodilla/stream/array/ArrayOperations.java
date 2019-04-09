package com.kodilla.stream.array;

import java.io.PrintStream;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream var1000 = IntStream.range(0, numbers.length).map(( n) -> {
            return numbers[n];
        });
        PrintStream var1001 = System.out;
        var1000.forEach(var1001::println);
        return IntStream.range(0, numbers.length).map((n) -> {
            return numbers[n];
        }).average().getAsDouble();
    }
}


